<%@ page contentType="text/html; charset=UTF-8" %> 
<%@ include file="/ssi/ssi.jsp"%>
 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="UTF-8"> 
<title></title> 
<style type="text/css"> 
*{ 
  font-family: gulim; 
  font-size: 20px; 
}
</style>
<script type="text/javascript">
	function incheck(f) {
		if(f.fname.value == "") {
			alert("사진을 선택해 주세요.");
			f.fname.focus();
			return false;
		}
	}
</script> 
<link href="${root}/css/style.css" rel="Stylesheet" type="text/css">
</head> 

<body>
<DIV class="title"></DIV>
 
<FORM 
	name='frm' 
	method='POST' 
	action='updateFileProc.jsp'
	enctype="me" 
	onsubmit="return incheck(this)">
  <TABLE>
    <TR>
      <TH>원본파일</TH>
      <TD>
      	<img src="./storage/<%=request.getParameter("oldfile")%>">
      	원본파일명 : <%=request.getParameter("oldfile") %>
      </TD>
    </TR>
    <tr>
    	<th>변경파일</th>
    	<td>
    		<input type="file" name="fname" >
    	</td>
    </tr>
  </TABLE>
  
  <DIV class='bottom'>
    <input type='submit' value='수정'>
    <input type='button' value='취소' onclick="history.back()">
  </DIV>
</FORM>
</body>

</html> 


