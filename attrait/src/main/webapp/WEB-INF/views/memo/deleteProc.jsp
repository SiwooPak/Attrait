<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/ssi/ssi.jsp"%>
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
	url += "&nowPage=${param.nowPage}";
	
	location.href = url;
}
</script>
</head>
<body>

	<div class="content">
	<c:choose>
		<c:when test="${flag }">
				메모를 삭제하였습니다.
		</c:when>
		<c:otherwise>
				메모삭제를 실패했습니다.
		</c:otherwise>
	</c:choose>
	</div>
		<br>
	<div class="bottom">
		<!-- onclick는 자바 스크립트 -->
		<input type="button" value="계속 등록"
			onclick="location.href='./createForm.do'"> 
		<input type="button" value="목록" onclick="mlist()">
	</div>
</body>
</html>
