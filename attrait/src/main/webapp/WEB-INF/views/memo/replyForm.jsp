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
<link href="${root }/css/style.css" rel="Stylesheet" type="text/css">
</head>
<body>

	<div class="title">답변</div>
	<!-- form을 쓰는 이유는 input태그를 사용해서 사용한 데이터를 모으는 작업을 하기 위해 -->
	<form 
	action="./reply" 
	name="frm" 
	method="post">
	<input type="hidden" name="memono" value="${dto.memono}">
	<input type="hidden" name="grpno" value="${dto.grpno}">
	<input type="hidden" name="indent" value="${dto.indent}">
	<input type="hidden" name="ansnum" value="${dto.ansnum}">
	<input type="hidden" name = "col" value="${param.col}">
	<input type="hidden" name = "word" value="${param.word}">
	<input type="hidden" name = "nowPage" value="${param.nowPage}">
	
		<table>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" size="30" value="${dto.title}"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td>
					<!-- 여러줄을 입력하기 위해 textarea태그를 사용 --> <textarea rows="10" cols="30"
						name="content" placeholder="SQL관련"></textarea>
				</td>
			</tr>
		</table>
		<div class="bottom">
			<input type="submit" value="답변전송">
		</div>
	</form>
</body>
</html>
