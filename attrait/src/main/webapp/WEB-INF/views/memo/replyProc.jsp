<%@page import="java.util.Map"%>
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
<script type="text/javascript">

	function mlist() {
		var url = "./list.do";
		url += "?col=<%=request.getParameter("col")%>";
		url += "&word=<%=request.getParameter("word")%>";
		url += "&nowPage=<%=request.getParameter("nowPage")%>";
	
		location.href = url;
	}
	
</script>
</head>
<body>
	<div class="title">처리결과</div>
	<div class="content">
		<%
			if (flag) {
				out.print("답변을 등록했습니다.");
			} else {
				out.print("답변 등록이 실패했습니다.");
			}
		%>

	</div>
	
	<div class="bottom">
		<!-- onclick이벤트 안에는 자바 스크립트 -->
		<input type="button" value="계속 등록" onclick="location.href='./createForm.do'"> 
		<input type="button" value="목록" onclick="mlist()">
	</div>

</body>
</html>