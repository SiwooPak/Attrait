<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/ssi/ssi.jsp"%>
<%
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
		url += "?col=${param.col}";
		url += "&cword=${param.word}";
		
		location.href = url;
	}
</script>
</head>
<body>

<div class="content">
<c:choose>
	<c:when test="${flag }">
		메모 수정 성공	
	</c:when>
	<c:otherwise>
		메모 수정 실패
	</c:otherwise>
</c:choose>
</div>
		<br>
<div class="bottom">
		<!-- onclick이벤트는 자바 스크립트 -->
<c:choose>
	<c:when test="${flag }">
		<input type="button" value="계속 등록" onclick="location.href='./createForm.do'">
		<input type="button" value="목록" onclick="mlist()">
	</c:when>
	<c:otherwise>
		<input type="button" value="다시시도" onclick="history.back()">
		<input type="button" value="목록" onclick="mlist()">
	</c:otherwise>
</c:choose>
</div>
</body>
</html>
