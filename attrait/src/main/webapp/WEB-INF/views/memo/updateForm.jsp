<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/ssi/ssi.jsp" %>
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
	<div class="title">수정</div>
	<form action="./update" name="frm" method="post">
		<!-- memono의 값이 페이지가 이동할때 보여줄 필요가 없기때문에 hidden으로 숨겨서 가져간다 -->
		<input type="hidden" name = "memono" value="${dto.memono}">
		<input type="hidden" name = "col" value="${param.col}">
		<input type="hidden" name = "word" value="${param.word}">
		<input type="hidden" name = "nowPage" value="${param.nowPage}">
		<table>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" size="30" value="${dto.title}" /></td>
			</tr>
			<tr>
				<th>내용</th>
				<!-- textarea은 변환작업을 해줄 필요가 없음 -->
				<td><textarea rows="10" cols="30" name="content">${dto.content}</textarea></td>
			</tr>
		</table>
		<div class="bottom">
			<input type="submit" value="전송">
		</div>
	</form>
</body>
</html>
