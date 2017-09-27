<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/ssi/ssi.jsp"%>
<!-- 속성의 값을 include로 지정해놓은 페이지를 가져오면 된다 -->
<%--
	List<MemoDTO> list = (List<MemoDTO>)request.getAttribute("list");
	String col = (String)request.getAttribute("col");
	String word = (String)request.getAttribute("word");
	int nowPage = (Integer)request.getAttribute("nowPage");
	String paging = (String)request.getAttribute("paging");
--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style type="text/css">
.search {
	width: 80%;
	margin: 10px auto;
	text-align: center;
}
</style>
<script type="text/javascript">
	/* 함수 선언은 function */
	function read(memono) { /* 매개변수는 데이터 타입을 받지 않는다. */
		/* 해야할 일을 여기서{ 처리 } */
		/* 지역변수 선언할때는 var을 선언할것을 권장 */
		var url = "./read"; /* 변수의 타입이 데이터가 들어갈때 결정된다(동적으로 변함) */
		/* url에다가 ?memono에다 실제 값을 넣어줌 */
		url += "?memono=" + memono;
		url += "&col=${col }";
		url += "&word=${word }";
		url += "&nowPage=${nowPage }";
		/* alert(url); *//* 여기서는 펑션함수가 잘 실행되는지 보기위해 띄운다 */
		location.href = url; /* 이동할때 파라미터(memono)를 가지고 이동함 */
	}
</script>
<link href="${root }/css/style.css" rel="Stylesheet" type="text/css">
</head>
<body>
	<div class="title">메모 목록</div>
	<div class="search">
<form name="frm" method="post" action="./list">
			<select name="col">
				<option value="wname"
					<c:out value="${col eq 'wname' ? 'selected' : '' }" />>성명</option>
				<option value="title"
					<c:out value="${col eq 'title' ? 'selected' : '' }" />>제목</option>
				<option value="content"
					<c:out value="${col eq 'content' ? 'selected' : '' }" />>내용</option>
				<option value="total"
					<c:out value="${col eq 'total' ? 'selected' : '' }" />>전체출력</option>
			</select> <input type="text" name="word" value="${word}">
			<button class="btn btn-default">검색</button>
			<button type="button" class="btn btn-default"
				onclick="location.href = './create'">등록</button>
		</form>
	</div>
	
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>날짜</th>
			<th>조회수</th>
			<th>grpno</th>
			<th>indent</th>
			<th>ansnum</th>
		</tr>
		<c:choose>
			<c:when test="${empty list }">
				<tr>
					<td colspan="7">등록된 메모가 없습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="dto" items="${list }">
		<tr>
			<!-- list에서 뽑아온걸 dto에 담았기 때문에 dto에 get으로 접근해서 데이터 뽑아옴 -->
			<td>${dto.memono}</td>
			<td>
				<c:forEach var="j" begin="1" end="${dto.indent }" step="1">
					<c:out value="&nbsp;&nbsp;" escapeXml="false"></c:out>
					
				</c:forEach>
					<c:if test="${dto.indent > 0}">
						<img src = '${root }/images/re.jpg'>
					</c:if>
				<!-- list에서 뽑아온걸 dto에 담았기 때문에 dto에 get으로 접근해서 데이터 뽑아옴 -->
				<a href="javascript:read('${dto.memono}')">${dto.title}</a>
				
				<c:if test="${util:newImg(dto.wdate) }"></c:if>
				
				<img src="${root}/images/new.gif">
			</td>
			<td>${dto.wdate}</td>
			<td>${dto.viewcnt}</td>
			<td>${dto.grpno}</td>
			<td>${dto.indent}</td>
			<td>${dto.ansnum}</td>
		</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
	</table>


	<div class="bottom">
   ${paging }
	</div>
</body>
</html>