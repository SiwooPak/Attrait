<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/ssi/ssi.jsp"%>

<%
	
	boolean flag = (Boolean)request.getAttribute("flag"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style type="text/css">
* {
	font-family: gulim;
	font-size: 20px;
}

</style>
</head>
<body>

	<div>
		<%
			if (flag) {
				out.print("메모를 등록했습니다.");
			} else {
				out.print("메모등록이 실패했습니다.");
			}
		%>

		<br>
		<!-- onclick이벤트 안에는 자바 스크립트 -->
		<input type="button" value="계속 등록" onclick="location.href='./createForm.do'"> 
		<input type="button" value="목록" onclick="location.href='./list.do'">
	</div>

</body>
</html>