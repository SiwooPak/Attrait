<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath }" />

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<!-- jQuery UI CSS파일 -->
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css"
	type="text/css" />
<!-- jQuery 기본 js파일 -->
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<!-- jQuery UI 라이브러리 js파일 -->
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<!-- jQplot 기본 js파일-->
<script src="${root}/B_admin/js/jquery.jqplot.js"></script>
<!-- jQplot 기본 js파일-->
<script src="${root}/B_admin/js/excanvas.min.js"></script>

<script src="${root}/B_admin/js/jqplot.barRenderer.min.js"></script>
<script src="${root}/B_admin/js/jqplot.categoryAxisRenderer.min.js"></script>

<style type="text/css">
th, th.w3-small, th.w3-tiny {
	text-align: center;
}

td.w3-tiny {
	text-align: center;
}

td#search_info{
	border-collapse: collapse;
}
</style>
</head>
<body>

	<!-- Page Content -->
	<div id="page-wrapper">
		<div class="container-fluid">

			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Sale_History(Product)</h1>
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
			<table width='100%' class="w3-panel w3-border">
				<tr>
					<th class="w3-black" width="13%">Sale_Date</th>
					<td id="search_info">
						<form name="frm" action="" method="">
						<input type="hidden" name="col" value="sdate">&nbsp;<input
								type="text" name="from_date" size="10" id="date1">~<input
								type="text" name="to_date" size="10" id="date2">
						</form>
					</td>
					<th class="w3-black" width="13%">Product_Name</th>
					<td>&nbsp;<input type="text" name="pname" size="20"></td>
				</tr>
				<tr>
					<th class="w3-black" width="13%">Product_Code</th>
					<td>&nbsp;<input type="text" name="pcode" size="20"></td>
				</tr>
			</table>
			<br>
			<hr class="w3-margin-bottom" style="width:100%; margin: 0 auto;">
			<section class="w3-container w3-center w3-border w3-margin">
				<h2>매출통계 그래프</h2>
				<div id="graph" style="height: 300px; width: 100%;"></div>
			</section>
			
			<script type="text/javascript">

				$(document).ready(function() {
					var userPoints = [ 10, 23, 28, 50 ]; /* 임시 데이타 */
					var jobPoints = [ 2, 5, 6, 18 ]; /* 임시 데이타 */

					/* 실제 데이터를 넣을때 */
					/* 
					var userPoints = []; 
					for (var i=0; i<2*Math.PI; i+=0.1){ 
						cosPoints.push([i, Math.cos(i)]); 
					} 
					 */
					$.jqplot('graph', [ userPoints, jobPoints ], {
						legend : {
							show : true,
							location : 'ne'
						},
						title : '스택수평바 차트 테스트',
						series : [ {
							label : '사용자'
						}, {
							label : '직업'
						} ],
						axes : {
							xaxis : {
								label : 'date',
								autoscale : true
							},
							yaxis : {
								label : 'count',
								autoscale : true
							}
						}
					});
				});
			</script>
			<table class="w3-panel w3-bordered"
				style="width: 100%; margin: 0 auto;">
				<tr>
					<th class="w3-small w3-black" rowspan="2">차트</th>
					<th class="w3-small w3-black" rowspan="2">판매상태</th>
					<th class="w3-small w3-black" rowspan="2">상품명</th>
					<th class="w3-small w3-black" rowspan="2">재고수</th>
					<th class="w3-small w3-black" colspan="9">매출액 구분</th>
				</tr>
				<tr>
					<th class="w3-tiny w3-black">수량</th>
					<th class="w3-tiny w3-black">적립금</th>
					<th class="w3-tiny w3-black">할인</th>
					<th class="w3-tiny w3-black">쿠폰</th>
					<th class="w3-tiny w3-black">수수료</th>
					<th class="w3-tiny w3-black">결제금액</th>
					<th class="w3-tiny w3-black">과세</th>
					<th class="w3-tiny w3-black">비과세</th>
					<th class="w3-tiny w3-black">비중</th>
				</tr>
				<tr>
					<td class="w3-tiny"><input type="checkbox" name="chart"></td>
					<td class="w3-tiny">품절</td>
					<td class="w3-tiny">9부 셔츠</td>
					<td class="w3-tiny">500</td>
					<td class="w3-tiny">26</td>
					<td class="w3-tiny">40,000</td>
					<td class="w3-tiny">0</td>
					<td class="w3-tiny">0</td>
					<td class="w3-tiny">0</td>
					<td class="w3-tiny">6,000,000</td>
					<td class="w3-tiny">6,000,000</td>
					<td class="w3-tiny">0</td>
					<td class="w3-tiny">0.24</td>
				</tr>
			</table>

		</div>
	</div>


</body>
</html>