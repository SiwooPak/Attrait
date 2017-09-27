package www.utility.attrait;
 
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
 
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

public class FileDownload extends javax.servlet.http.HttpServlet {

  static final long serialVersionUID = 1L;
  private ServletConfig config = null;
 
  public FileDownload() {
    super();
  }
 
  /**
   * 톰캣 실행시 최초 1번만 실행 됩니다. init()은 생략가능
   * 
   * @param config
   *          web.xml에 접근가능, 서블릿 환경 정보 저장 객체
   */
  @Override
  public void init(ServletConfig config) throws ServletException {
    this.config = config;
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doProcess(request, response);
  }
 
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doProcess(request, response);
  }
 
  protected void doProcess(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    ServletContext ctx = config.getServletContext();
    String dir = ctx.getRealPath(request.getParameter("dir"));
    String filename = request.getParameter("filename");
 
    File file = new File(dir + "/" + filename);
    String fileStr = dir + "/" + filename;
    String contentType = getType(fileStr);
    System.out.println("다운로드 타입: " + contentType);
 
    String disposition = getDisposition(filename, getBrowser(request));
    response.addHeader("Content-disposition", disposition);
    response.setHeader("Content-Transfer-Encoding", "binary");
    response.setContentLength((int) file.length());
    response.setContentType(contentType);
    response.setHeader("Connection", "close");
 
    byte buffer[] = new byte[4096];
 
    try {
      if (file.isFile()) {
        BufferedInputStream bis = 
        		new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = 
        		new BufferedOutputStream(response.getOutputStream());
        int read = 0;

        while ((read = bis.read(buffer)) != -1) {
          bos.write(buffer, 0, read);
        }
        bis.close();
        bos.close();
      }
 
    } catch (Exception e) {
 
    }
  }
 
  public String getType(String fileUrl) {
    String type = "";
    fileUrl = "file:" + fileUrl;
    try {
      URL u = new URL(fileUrl);
      URLConnection uc = u.openConnection();
      type = uc.getContentType();
 
    } catch (Exception e) {
      System.out.println(e.toString());
    }
 
    return type;
  }
 
  public String getBrowser(HttpServletRequest request) {
    String header = request.getHeader("User-Agent");
    if (header.indexOf("MSIE") > -1) {
      return "MSIE";
    } else if (header.indexOf("Chrome") > -1) {
      return "Chrome";
    } else if (header.indexOf("Opera") > -1) {
      return "Opera";
    }
    return "Firefox";
  }
 
  public static synchronized String getDisposition(String filename, String browser) {
    String dispositionPrefix = "attachment;filename=";
    String encodedFilename = null;
    try {
      if (browser.equals("MSIE")) {
        encodedFilename = URLEncoder.encode(filename, "UTF-8").replaceAll(
            "\\+", "%20");
      } else if (browser.equals("Firefox")) {
        encodedFilename =
 
        "\"" + new String(filename.getBytes("UTF-8"), "8859_1") + "\"";
      } else if (browser.equals("Opera")) {
        encodedFilename =
 
        "\"" + new String(filename.getBytes("UTF-8"), "8859_1") + "\"";
      } else if (browser.equals("Chrome")) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < filename.length(); i++) {
          char c = filename.charAt(i);
          if (c > '~') {
            sb.append(URLEncoder.encode("" + c, "UTF-8"));
          } else {
            sb.append(c);
          }
        }
        encodedFilename = sb.toString();
      } else {
        System.out.println("Not supported browser");
      }
    } catch (Exception e) {
 
    }
 
    return dispositionPrefix + encodedFilename;
  }
 
}