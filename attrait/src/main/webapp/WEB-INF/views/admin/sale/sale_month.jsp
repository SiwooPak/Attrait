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
<!-- jQplot 캔버스-->
<script src="${root}/B_admin/js/excanvas.min.js"></script>
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
					<h1 class="page-header">Sale_History(Month)</h1>
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
					<th class="w3-black w3-center" width="13%">Sale_Date</th>
					<td>
						<form name="frm" action="" method="">
							<input type="hidden" name="col" value="sdate"> &nbsp; <input
								type="text" name="from_date" size="10" id="date1">~<input
								type="text" name="to_date" size="10" id="date2">
						</form>
					</td>
				</tr>
			</table>
			<br>
			<hr class="w3-margin-bottom" style="width: 90%; margin: 0 auto;">
			<section class="w3-container w3-center w3-border w3-margin">
				<h2>매출통계 그래프</h2>
				<div id="graph" style="height: 300px; width: 100%;"></div>
				<hr>
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
						title : 'Activity',
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
					<th class="w3-small w3-black" rowspan="2">입금일</th>
					<th class="w3-small w3-black" colspan="4">매출액구분</th>
					<th class="w3-small w3-black" rowspan="2">부가세</th>
					<th class="w3-small w3-black" rowspan="2">매출액</th>
					<th class="w3-small w3-black" rowspan="2">매출원가</th>
					<th class="w3-small w3-black" rowspan="2">마진율(%)</th>
					<th class="w3-small w3-black" colspan="2">매출이익</th>

				</tr>
				<tr>
					<th class="w3-tiny w3-black">수량</th>
					<th class="w3-tiny w3-black">결제금액</th>
					<th class="w3-tiny w3-black">과세</th>
					<th class="w3-tiny w3-black">비과세</th>
					<th class="w3-tiny w3-black">세전</th>
					<th class="w3-tiny w3-black">세후</th>
				</tr>
				<tr>
					<td class="w3-tiny">20170912</td>
					<td class="w3-tiny">40</td>
					<td class="w3-tiny">6,000,000</td>
					<td class="w3-tiny">400,000</td>
					<td class="w3-tiny">0</td>
					<td class="w3-tiny">400,000</td>
					<td class="w3-tiny">6,000,000</td>
					<td class="w3-tiny">4,800,000</td>
					<td class="w3-tiny">25.43</td>
					<td class="w3-tiny">1,600,000</td>
					<td class="w3-tiny">1,000,000</td>
				</tr>
				<tr>
					<td class="w3-tiny">20170913</td>
					<td class="w3-tiny">40</td>
					<td class="w3-tiny">6,000,000</td>
					<td class="w3-tiny">400,000</td>
					<td class="w3-tiny">0</td>
					<td class="w3-tiny">400,000</td>
					<td class="w3-tiny">6,000,000</td>
					<td class="w3-tiny">4,800,000</td>
					<td class="w3-tiny">25.43</td>
					<td class="w3-tiny">1,600,000</td>
					<td class="w3-tiny">1,000,000</td>

				</tr>
			</table>

		</div>
	</div>


</body>
</html>