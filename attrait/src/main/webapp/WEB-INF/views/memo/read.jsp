<%@ page contentType="text/html; charset=UTF-8"%>
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
<link href="${root }/css/style.css" rel="Stylesheet" type="text/css">
<script type="text/javascript">

	function mreply(memono) {
		var url = "./reply";
		url += "?memono="+memono; 
		url += "&col=${param.col}"; 
		url += "&word=${param.word}"; 
		url += "&nowPage=${param.nowPage}"; 
		location.href = url;
	
	}
	function mupdate(memono) { // 수정
		var url  = "./update";
		url += "?memono="+memono; // 수정할 하나의 레코드를 가져와야함
		url += "&col=${param.col}"; 
		url += "&word=${param.word}"; 
		url += "&nowPage=${param.nowPage}";  
		location.href = url;
	}
	
	function mdelete(memono) { // 삭제
		var url = "./delete";
		url += "?memono="+memono; // 삭제할 하나의 레코드를 가져와야함
		url += "&col=${param.col}"; 
		url += "&word=${param.word}"; 
		url += "&nowPage=${param.nowPage}"; 
		
		location.href = url;
	}
	function mlist() {
		var url = "./list";
		url += "?col=${param.col}"; 
		url += "&word=${param.word}"; 
		url += "&nowPage=${param.nowPage}"; 
		
		location.href = url;
	}
	function updateFile() {
		var url = "./updateFile";
		url += "?col=${param.col}"; 
		url += "&word=${param.word}"; 
		url += "&nowPage=${param.nowPage}"; 
		
		location.href = url;
	}

</script>
</head>
<body>

<div class="title">조회</div>

	<table>
		<tr>
			<th>제목</th>
			<td>${dto.title}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${dto.content}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>
				${dto.viewcnt}
			</td>
		</tr>
		<tr>
			<th>등록일</th>
			<td>
				${dto.wdate}
			</td>
		</tr>
	</table>
<div class="bottom">
	<button type="button" onclick="location.href='./create'">등록</button>
	<!-- HTML,자바스크립트 안에서 JSP변수를 사용할때는 표현식으로 가져가야함 -->
	<!-- mupdate함수 호출할때 memono매개변수를 가져감 -->
	<button type="button" onclick="mupdate('${param.memono }')" >정보수정</button>
	<button type="button" onclick="updateFile()">사진변경</button>
	<button type="button" onclick="mdelete('${param.memono }')" >삭제</button>
	<button type="button" onclick="mreply('${param.memono }')" >답변</button>
	<button type="button" onclick="mlist()">목록</button>
</div>

</body>
</html>