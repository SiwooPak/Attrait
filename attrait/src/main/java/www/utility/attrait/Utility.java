package www.utility.attrait;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class Utility {
	
	/** 
	  * 댓글용 페이징 메소드
	  * @param totalRecord 전체 레코드수 
	  * @param nowPage     현재 페이지 
	  * @param recordPerPage 페이지당 레코드 수 
	  * @param url 이동할 페이지 
	  * @param bbsno 상위글번호
	  * @return 페이징 생성 문자열
	  */ 
	 public static String pagingR(int totalRecord, int nPage, int recordPerPage,String url,int bbsno,int nowPage, String col, String word){ 
	   int pagePerBlock = 10; 
	   int totalPage = (int)(Math.ceil((double)totalRecord/recordPerPage)); 
	   int totalGrp = (int)(Math.ceil((double)totalPage/pagePerBlock));
	   int nowGrp = (int)(Math.ceil((double)nPage/pagePerBlock));   
	   int startPage = ((nowGrp - 1) * pagePerBlock) + 1; 
	   int endPage = (nowGrp * pagePerBlock);             
	    
	   StringBuffer str = new StringBuffer(); 
	    
	   str.append("<style type='text/css'>"); 
	   str.append("  #paging {text-align: center; margin-top: 5px; font-size: 1em;}"); 
	   str.append("  #paging A:link {text-decoration:none; color:black; font-size: 1em;}"); 
	   str.append("  #paging A:hover{text-decoration:none; background-color: #CCCCCC; color:black; font-size: 1em;}"); 
	   str.append("  #paging A:visited {text-decoration:none;color:black; font-size: 1em;}"); 
	   str.append("  .span_box_1{"); 
	   str.append("    text-align: center;");    
	   str.append("    font-size: 1em;"); 
	   str.append("    border: 1px;"); 
	   str.append("    border-style: solid;"); 
	   str.append("    border-color: #cccccc;"); 
	   str.append("    padding:1px 6px 1px 6px; /*위, 오른쪽, 아래, 왼쪽*/"); 
	   str.append("    margin:1px 2px 1px 2px; /*위, 오른쪽, 아래, 왼쪽*/"); 
	   str.append("  }"); 
	   str.append("  .span_box_2{"); 
	   str.append("    text-align: center;");    
	   str.append("    background-color: #668db4;"); 
	   str.append("    color: #FFFFFF;"); 
	   str.append("    font-size: 1em;"); 
	   str.append("    border: 1px;"); 
	   str.append("    border-style: solid;"); 
	   str.append("    border-color: #cccccc;"); 
	   str.append("    padding:1px 6px 1px 6px; /*위, 오른쪽, 아래, 왼쪽*/"); 
	   str.append("    margin:1px 2px 1px 2px; /*위, 오른쪽, 아래, 왼쪽*/"); 
	   str.append("  }"); 
	   str.append("</style>"); 
	   str.append("<DIV id='paging'>"); 
	 
	   int _nowPage = (nowGrp-1) * pagePerBlock; 
	   if (nowGrp >= 2){ 
	     str.append("<span class='span_box_1'><A href='./"+url+"?nowPage="+nowPage+"&col="+col+"&word="+word+"&bbsno="+bbsno+"&nPage="+_nowPage+"'>이전</A></span>"); 
	   } 
	 
	   for(int i=startPage; i<=endPage; i++){ 
	     if (i > totalPage){ 
	       break; 
	     } 
	 
	     if (nPage == i){ 
	       str.append("<span class='span_box_2'>"+i+"</span>"); 
	     }else{ 
	       str.append("<span class='span_box_1'><A href='./"+url+"?nowPage="+nowPage+"&col="+col+"&word="+word+"&bbsno="+bbsno+"&nPage="+i+"'>"+i+"</A></span>");   
	     } 
	   } 
	    
	   _nowPage = (nowGrp * pagePerBlock)+1; 
	   if (nowGrp < totalGrp){ 
	     str.append("<span class='span_box_1'><A href='./"+url+"?nowPage="+nowPage+"&col="+col+"&word="+word+"&bbsno="+bbsno+"&nPage="+_nowPage+"'>다음</A></span>"); 
	   } 
	   str.append("</DIV>"); 
	    
	   return str.toString(); 
	 } 
	
	 public static String saveFileSpring30(MultipartFile multipartFile, String basePath) { 
	        String fileName = ""; 
	        String originalFileName = multipartFile.getOriginalFilename(); 
	        String contentType = multipartFile.getContentType(); 
	        long fileSize = multipartFile.getSize(); 
	         
	        System.out.println("fileSize: " + fileSize); 
	        System.out.println("originalFileName: " + originalFileName); 
	         
	        InputStream inputStream = null; 
	        OutputStream outputStream = null; 
	 
	    
	        try { 
	            if( fileSize > 0 ) { 
	                inputStream = multipartFile.getInputStream(); 
	                File oldfile = new File(basePath, originalFileName); 
	             
	                if ( oldfile.exists()){ 
	                    for(int k=0; true; k++){ 	             
	                        oldfile = new File(basePath,"("+k+")"+originalFileName); 
	                     
	                        if(!oldfile.exists()){ //존재하지 않는 경우 
	                            fileName = "("+k+")"+originalFileName; 
	                            break; 
	                        } 
	                    } 
	                }else{ 
	                    fileName = originalFileName; 
	                } 

	                String serverFullPath = basePath + "\\" + fileName; 
	                 
	                System.out.println("fileName: " + fileName); 
	                System.out.println("serverFullPath: " + serverFullPath); 
	                 
	                outputStream = new FileOutputStream( serverFullPath ); 

	                int readBytes = 0; 
	                byte[] buffer = new byte[8192]; 
	 
	                while((readBytes = inputStream.read(buffer, 0, 8192)) != -1 ) { 
	                    outputStream.write( buffer, 0, readBytes ); 
	                } 
	                outputStream.close(); 
	                inputStream.close(); 
	                         
	            } 
	 
	        } catch(Exception e) { 
	            e.printStackTrace();   
	        }finally{ 
	             
	        } 
	         
	        return fileName; 
	    } 
	

	 public static String paging(String url, int totalRecord, int nowPage, int recordPerPage, String col, String word){
		   int pagePerBlock = 10; 
		   int totalPage = (int)(Math.ceil((double)totalRecord/recordPerPage)); 
		   int totalGrp = (int)(Math.ceil((double)totalPage/pagePerBlock));
		   int nowGrp = (int)(Math.ceil((double)nowPage/pagePerBlock));
		   int startPage = ((nowGrp - 1) * pagePerBlock) + 1; 
		   int endPage = (nowGrp * pagePerBlock);             
		   StringBuffer str = new StringBuffer(); 
		    
		   str.append("<style type='text/css'>"); 
		   str.append("  #paging {text-align: center; margin-top: 5px; font-size: 1em;}"); 
		   str.append("  #paging A:link {text-decoration:none; color:black; font-size: 1em;}"); 
		   str.append("  #paging A:hover{text-decoration:none; background-color: #CCCCCC; color:black; font-size: 1em;}"); 
		   str.append("  #paging A:visited {text-decoration:none;color:black; font-size: 1em;}"); 
		   str.append("  .span_box_1{"); 
		   str.append("    text-align: center;");    
		   str.append("    font-size: 1em;"); 
		   str.append("    border: 1px;"); 
		   str.append("    border-style: solid;"); 
		   str.append("    border-color: #cccccc;"); 
		   str.append("    padding:1px 6px 1px 6px; /*위, 오른쪽, 아래, 왼쪽*/"); 
		   str.append("    margin:1px 2px 1px 2px; /*위, 오른쪽, 아래, 왼쪽*/"); 
		   str.append("  }"); 
		   str.append("  .span_box_2{"); 
		   str.append("    text-align: center;");    
		   str.append("    background-color: #668db4;"); 
		   str.append("    color: #FFFFFF;"); 
		   str.append("    font-size: 1em;"); 
		   str.append("    border: 1px;"); 
		   str.append("    border-style: solid;"); 
		   str.append("    border-color: #cccccc;"); 
		   str.append("    padding:1px 6px 1px 6px; /*위, 오른쪽, 아래, 왼쪽*/"); 
		   str.append("    margin:1px 2px 1px 2px; /*위, 오른쪽, 아래, 왼쪽*/"); 
		   str.append("  }"); 
		   str.append("</style>"); 
		   str.append("<DIV id='paging'>"); 

		   int _nowPage = (nowGrp-1) * pagePerBlock; 
		   if (nowGrp >= 2){ 					
		     str.append("<span class='span_box_1'><A href='./"+url+"?col="+col+"&word="+word+"&nowPage="+_nowPage+"'>이전</A></span>"); 
		   } 
		 
		   for(int i=startPage; i<=endPage; i++){ 
		     if (i > totalPage){ 
		       break;  
		     } 
		 
		     if (nowPage == i){ 
		       str.append("<span class='span_box_2'>"+i+"</span>"); 
		     }else{ 
		       str.append("<span class='span_box_1'><A href='./"+url+"?col="+col+"&word="+word+"&nowPage="+i+"'>"+i+"</A></span>");   
		     } 
		   } 
		    
		   _nowPage = (nowGrp * pagePerBlock)+1; 
		   if (nowGrp < totalGrp){ 
		     str.append("<span class='span_box_1'><A href='./"+url+"?col="+col+"&word="+word+"&nowPage="+_nowPage+"'>다음</A></span>"); 
		   } 
		   
		   str.append("</DIV>"); 
		    
		   return str.toString(); 
		 } 
	
	
	public static String getCodeValue(String code){
		String value = null;
		Hashtable codes = new Hashtable(); 

		codes.put("A01", "회사원");
		codes.put("A02", "전산관련직");
		codes.put("A03", "연구전문직");
		codes.put("A04", "학생");
		codes.put("A05", "일반자영업");
		codes.put("A06", "공무원");
		codes.put("A07", "의료인");
		codes.put("A08", "법조인");
		codes.put("A09", "종교/언론/예술인");
		codes.put("A10", "기타");
		
		value = (String)codes.get(code); 
		return value; 
	}
	
	/**
     * 오늘,어제,그제 날짜 가져오기
     * @return List- 날짜들 저장
     */
    public static List<String> getDay(){
        List<String> list = new ArrayList<String>();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance(); 
        for(int j = 0; j < 3; j++){ 
            list.add(sd.format(cal.getTime())); 
            cal.add(Calendar.DATE, -1); 
        }
        
        return list; 
    }
    /**
     * 등록날짜와 오늘,어제,그제날짜와 비교
     * @param wdate - 등록날짜
     * @return - true:오늘,어제,그제중 등록날짜와 같음
     *           false:오늘,어제,그제 날짜가 등록날짜와 다 다름
     */
    public static boolean compareDay(String wdate){
        boolean flag = false;
        List<String> list = getDay(); 
       
        if(wdate.equals(list.get(0))	  
           || wdate.equals(list.get(1))   
           || wdate.equals(list.get(2))){ 
            flag = true;        		 
        }
          
        return flag; 
    }
	 
	
// -------------------------------------------------------------------------------------------------------------------------
	
	public static String checkNull(String str){
		
		if(str == null) {
			str = "";
		}
		return str;
	}
	public static void deleteFile(String upDir, String oldfile) {
		File file = new File(upDir, oldfile);
		if(file.exists()) { 
			file.delete();
		}
	}
}
