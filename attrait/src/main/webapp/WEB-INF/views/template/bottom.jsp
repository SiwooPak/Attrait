<%@ page contentType="text/html; charset=UTF-8" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
 
<!-- 하단 메뉴 시작 -->
	<!--//footer-->
	<div class="footer">
	<div class="footer-middle">
				<div class="container">
					<div class="col-md-3 footer-middle-in">
						<a href="${root }"><img src="${root }/B_user/images/log.png" alt=""></a>
						
					</div>
					
					<div class="col-md-3 footer-middle-in">
						<h6>Used Technology</h6>
						<ul class=" in">
							<li><a href="#" onclick="return false;">Spring</a></li>
							<li><a href="#" onclick="return false;">Maven</a></li>
							<li><a href="#" onclick="return false;">Tiles</a></li>
							<li><a href="#" onclick="return false;">MyBatis</a></li>
							<li><a href="#" onclick="return false;">Git</a></li>
						</ul>
						<ul class="in in1">
							<li><a href="#" onclick="return false;">Ajax</a></li>
							<li><a href="#" onclick="return false;">jQuery</a></li>
							<li><a href="#" onclick="return false;">JSTL</a></li>
							<li><a href="#" onclick="return false;">HTML/CSS</a></li>
							<li><a href="#" onclick="return false;">Bootstrap</a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="col-md-2 footer-middle-in"></div>
					<div class="col-md-3 footer-middle-in">
						<h6>Team Members</h6>
						<ul class="tag-in">
							<li><a href="#" onclick="return false;">Si Woo Park</a></li>
							<li><a href="#" onclick="return false;">Hyun Chul Kim</a></li>
							<li><a href="#" onclick="return false;">Do Hyung Kim</a></li>
							<li><a href="#" onclick="return false;">Jeong Hwan Park</a></li>
							<li><a href="#" onclick="return false;">Ga Ram Lim</a></li>
							<li><a href="#" onclick="return false;">Eun Hye Choi</a></li>
						</ul>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<!--//footer-->
<!-- 하단 메뉴 끝 -->

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="${root }/B_user/js/simpleCart.min.js"> </script>
<!-- slide -->
<script src="${root }/B_user/js/bootstrap.min.js"></script>
<!--light-box-files -->
		<script src="${root }/B_user/js/jquery.chocolat.js"></script>
		<link rel="stylesheet" href="${root }/B_user/css/chocolat.css" type="text/css" media="screen" charset="utf-8">
		<!--light-box-files -->
		<script type="text/javascript" charset="utf-8">
		$(function() {
			$('a.picture').Chocolat();
		});
		</script>

</body>

</html>