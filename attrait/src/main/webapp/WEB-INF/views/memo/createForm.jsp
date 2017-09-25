<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
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
	text-align: center;
	
}
</style>
<script type="text/javascript">
	function inputCheck(f) {
		if(f.title.value == ""){
			alert("제목을 입력하세요.");
			f.title.focus();
			return false;

		}
		if(f.content.value == ""){
			alert("내용을 적어주세요.");
			f.content.focus();
			return false;
		}

		
	}
</script>
<link href="${root }/css/style.css" rel="Stylesheet" type="text/css">

</head>
<body>

	<div class="title">등록</div>
	<!-- form을 쓰는 이유는 input태그를 사용해서 사용한 데이터를 모으는 작업을 하기 위해 -->

		<form action="./create"
			 method="post"
			 onsubmit="return inputCheck(this)">
		
		<table>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" size="30" /></td>
			</tr>
			<tr>
				<th>내용</th>
				<td>
					<!-- 여러줄을 입력하기 위해 textarea태그를 사용 -->
					 <textarea rows="10" cols="30" name="content"></textarea>
				</td>
			</tr>

		</table>
		<div class="bottom">
			<input type="submit" value="전송">
		</div>
	</form>
</body>
</html>
