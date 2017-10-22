<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/sale/ssi.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
// jQuery UI CSS파일
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css"
	type="text/css" />
// jQuery 기본 js파일
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
// jQuery UI 라이브러리 js파일
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<style type="text/css">
th, th.w3-small, th.w3-tiny {
	text-align: center;
}

td.w3-tiny {
	text-align: center;
}
</style>
</head>
<body>

	<!-- Page Content -->
	<div id="page-wrapper">
		<div class="container-fluid">

			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Sale's History</h1>
				</div>
			</div>
			<!-- ... Your content goes here ... -->
			<div class="w3-middle">
				<div class="w3-row ">
					<div class="w3-col">
						<div class="w3-right">
							<button class="w3-button w3-tiny w3-black w3-round"
								onclick="search_date();">Search</button>
							<button class="w3-button w3-tiny w3-black w3-round"
								onclick="exportToExcel();">Down(Excel)</button>
						</div>
					</div>
				</div>
			</div>
			<br>
			<table width='100%'>
				<tr>
					<th class="w3-black" width="13%">Sale_Date</th>
					<td>
						<form name="frm" action="" method="">
							<input type="hidden" name="col" value="sdate"> &nbsp; <input
								type="text" name="from_date" size="10" id="date1">~<input
								type="text" name="to_date" size="10" id="date2">
						</form>
					</td>
				</tr>
			</table>

			<script type="text/javascript">
				function exportToExcel() {
					document.frm.action = "./exportToExcel";
					document.frm.method = "POST";
					document.frm.submit();
				}

				function search_date() {
					document.frm.action = "./list";
					document.frm.method = "POST";
					document.frm.submit();
				}
			</script>

			<hr class="w3-margin-bottom" style="width: 100%; margin: 0 auto;">
			<br> <br>
			<table class="w3-table w3-bordered" style="width: 100%;">
				<tr>
					<th class="w3-small w3-black">매출번호</th>
					<th class="w3-small w3-black">매출일</th>
					<th class="w3-small w3-black">상품코드</th>
					<th class="w3-small w3-black">상품명</th>
					<th class="w3-small w3-black">수량</th>
					<th class="w3-small w3-black">총매출</th>
					<th class="w3-small w3-black">원가</th>
					<th class="w3-small w3-black">부가세</th>
					<th class="w3-small w3-black">순수매출</th>
				</tr>
				<c:choose>
					<c:when test="${empty list}">
						<tr>
							<td colspan="9">No registered sales's history.</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="dto" items="${list}">
							<tr>
								<td class="w3-tiny">${dto.scode}</td>
								<td class="w3-tiny">${dto.sdate}</td>
								<td class="w3-tiny">${dto.pcode}</td>
								<td class="w3-tiny">${dto.pdtdto.pname }</td>
								<td class="w3-tiny">${dto.sqty}</td>
								<td class="w3-tiny">${dto.stotal}</td>
								<td class="w3-tiny">${dto.pdtdto.inprice * dto.sqty}</td>
								<td class="w3-tiny">${dto.stotal*0.1}</td>
								<td class="w3-tiny">${dto.stotal-((dto.pdtdto.inprice*dto.sqty)+(dto.stotal*0.1))}</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</table>

			<div class="w3-padding w3-display-bottom">${paging}</div>

			<script type="text/javascript">
				$(document).ready(function() { // 이부분 필수 암기
					$("#date1,#date2").datepicker({ // 이부분 필수 암기
						showButtonPanel : true,
						currentText : '오늘 날짜',
						closeText : '닫기',
						dateFormat : "yy-mm-dd" // 이부분 필수 암기	

					});

				});

				/* 
				$(function() {
					 $("#date1,#date2").datepicker({
				         showButtonPanel: true, 
				         currentText: '오늘 날짜', 
				         closeText: '닫기', 
				         dateFormat: "yy-mm-dd"
				  });
				}); */
			</script>

		</div>
	</div>
	<br>
	<br>
	<br>
	<!-- Page Content -->

</body>
</html>