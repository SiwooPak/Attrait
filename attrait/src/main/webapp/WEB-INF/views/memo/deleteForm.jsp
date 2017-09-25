<%@ page contentType="text/html; charset=UTF-8" %> 
<%@ include file="/ssi/ssi.jsp" %>
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
function mlist() {
	var url = "./list";
	url += "?col=${param.col}";
	url += "&cword=${param.word}";
	
	location.href = url;
}
</script> 
<link rel="stylesheet" href = "${root}/css/style.css">
</head> 
<body> 
<!-- 비밀번호를 입력해서 삭제할수 있게끔 할수 있음 -->
<div class="title">삭제확인</div>
<c:choose>
	<c:when test="${flag }">
		<div class="content">답변이 달린 글은 삭제할수 없습니다.</div>
		<div class="bottom">
			<button type="button" onclick="history.back()">뒤로가기</button>
			<button type="button" onclick="mlist()" >목록</button>
		</div>
	</c:when>
	<c:otherwise>
<form action="./delete" method="post">
		<!-- 페이지 이동할때 가져갈 memono -->
	<input type="hidden" name="memono" value="${param.memono}">
	<input type="hidden" name = "col" value="${param.col}">
	<input type="hidden" name = "word" value="${param.word}">
	<input type="hidden" name = "nowPage" value="${param.nowPage}">
	
	<div style="text-align: center;">
		삭제하시면 복구할 수 없습니다.<br>
		삭제를 하시려면 삭제 버튼을 클릭하세요.<br>
		취소는 '목록'버튼을 누르세요.<br>
	</div>
<div class="bottom">
	<button type="submit" >삭제완료</button>
	<button type="button" onclick="mlist()" >목록</button>
</div>
	</form>
	</c:otherwise>

</c:choose>
</body> 
</html> 