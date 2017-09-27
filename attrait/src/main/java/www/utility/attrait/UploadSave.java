package www.utility.attrait;
 
import java.io.File;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
 
import org.apache.commons.fileupload.DiskFileUpload;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadException;
 
public class UploadSave extends HttpServletRequestWrapper {
 
  private boolean multipart = false;
 
  private HashMap parameterMap; 
  private HashMap fileItemMap; 
 
  public UploadSave(HttpServletRequest request)
      throws FileUploadException {
    this(request, -1, -1, null);
  }
 
  public UploadSave(HttpServletRequest request, int threshold, int max,
      String repositoryPath) throws FileUploadException {
    super(request);
 
    parsing(request, threshold, max, repositoryPath);
  }
 
  private void parsing(HttpServletRequest request, int threshold, int max,
      String repositoryPath) throws FileUploadException {
 
    if (FileUpload.isMultipartContent(request)) {
      multipart = true;
 
      parameterMap = new java.util.HashMap();
      fileItemMap = new java.util.HashMap();
 
      DiskFileUpload diskFileUpload = new DiskFileUpload();
      if (threshold != -1) {
        diskFileUpload.setSizeThreshold(threshold);
      }
      diskFileUpload.setSizeMax(max);
      if (repositoryPath != null) {
        diskFileUpload.setRepositoryPath(repositoryPath);
      }
 
      List list = diskFileUpload.parseRequest(request);
      for (int i = 0; i < list.size(); i++) {
        FileItem fileItem = (FileItem) list.get(i);
        String name = fileItem.getFieldName();
 
        if (fileItem.isFormField()) { 
          String value = fileItem.getString();
          String[] values = (String[]) parameterMap.get(name);
          if (values == null) {
            values = new String[] { value };
          } else {
            String[] tempValues = new String[values.length + 1];
            System.arraycopy(values, 0, tempValues, 0, values.length);
            tempValues[tempValues.length - 1] = value;
            values = tempValues;
          }
          parameterMap.put(name, values);
        } else { 
          System.out.println("?��?�� ?���? 발견?�� ?��그명: " + name);
          System.out.println("?��?�� ?���? 발견?�� ?��?���?: " + fileItem.getName());
          fileItemMap.put(name, fileItem);
        }
      }
      addTo(); 
    }
  }
 
  public boolean isMultipartContent() {
    return multipart;
  }
 
  public String getParameter(String name) {
    if (multipart) {
      String[] values = (String[]) parameterMap.get(name);
      if (values == null)
        return null;
      return values[0];
    } else
      return super.getParameter(name);
  }
 

  public String[] getParameterValues(String name) {
    if (multipart)
      return (String[]) parameterMap.get(name);
    else
      return super.getParameterValues(name);
  }
 
  public Enumeration getParameterNames() {
    if (multipart) {
      return new Enumeration() {
        Iterator iter = parameterMap.keySet().iterator();
 
        public boolean hasMoreElements() {
          return iter.hasNext();
        }
 
        public Object nextElement() {
          return iter.next();
        }
      };
    } else {
      return super.getParameterNames();
    }
  }
 
  public Map getParameterMap() {
    if (multipart)
      return parameterMap;
    else
      return super.getParameterMap();
  }
 
  public FileItem getFileItem(String name) {
    if (multipart)
      return (FileItem) fileItemMap.get(name);
    else
      return null;
  }
 
  public void delete() {
    if (multipart) {
      Iterator fileItemIter = fileItemMap.values().iterator();
      while (fileItemIter.hasNext()) {
        FileItem fileItem = (FileItem) fileItemIter.next();
        fileItem.delete();
      }
    }
  }
 
  public void addTo() {
    super.setAttribute(UploadSave.class.getName(), this);
  }
 
  public static UploadSave getFrom(HttpServletRequest request) {
    return (UploadSave) request.getAttribute(UploadSave.class
        .getName());
  }
 
  public static boolean hasWrapper(HttpServletRequest request) {
    if (UploadSave.getFrom(request) == null) {
      return false;
    } else {
      return true;
    }
  }
 
  public static String saveFile(FileItem fileItem, String upDir) {
    String filename = ""; 
 
    System.out.println("?��?��?�� ?��?���?: " + fileItem.getName()); 
 
    int idx = fileItem.getName().lastIndexOf("\\"); 
    if (idx == -1) { 
      idx = fileItem.getName().lastIndexOf("/");
    }
 
    filename = fileItem.getName().substring(idx + 1); 
 
    try {
      File uploadedFile = new File(upDir, filename);

      if (uploadedFile.exists() == true) {
        for (int k = 0; true; k++) { 
          uploadedFile = new File(upDir, "(" + k + ")" + filename); 
          if (!(uploadedFile.exists() == true)) {
            filename = "(" + k + ")" + filename;
            break;
          }
        }
      }
 
      fileItem.write(uploadedFile); 
    } catch (Exception e) {
      System.out.println(e.toString());
    }
 
    return filename; 
  }

  public static boolean deleteFile(String folder, String fileName) {
    boolean ret = false;
 
    try {
      if (fileName != null) { 
        File file = new File(folder + "/" + fileName);
        ret = file.delete();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
 
    return ret;
  }
 
  public HashMap getFileItemMap() {
    return fileItemMap;
  }
 
  public void setFileItemMap(HashMap fileItemMap) {
    this.fileItemMap = fileItemMap;
  }
 
  public int getFileCount() {
    return this.fileItemMap.size();
  }
 
  public static synchronized String encode(String str) {
    String corean = null;
    try {
      corean = new String(str.getBytes("ISO-8859-1"), "UTF-8");
      // corean= new String(str.getBytes("ISO-8859-1"), "KSC5601");
    } catch (Exception e) {
      return corean;
    }
    return corean;
  }
 
}