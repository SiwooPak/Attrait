<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<%
	String id = (String) session.getAttribute("id");
	String grade = (String) session.getAttribute("grade");
%>

<!DOCTYPE html>
<html>
<head>
<link href="${root }/B_user/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<!--theme-style-->
<link href="${root }/B_user/css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Shopin Responsive web template, Bootstrap Web Templates, Flat Web Templates, AndroId Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--theme-style-->
<link href="${root }/B_user/css/style4.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<script src="${root }/B_user/js/jquery.min.js"></script>
<!--- start-rate---->
<script src="${root }/B_user/js/jstarbox.js"></script>
	<link rel="stylesheet" href="${root }/B_user/css/jstarbox.css" type="text/css" media="screen" charset="utf-8" />
		<script type="text/javascript">
			jQuery(function() {
			jQuery('.starbox').each(function() {
				var starbox = jQuery(this);
					starbox.starbox({
					average: starbox.attr('data-start-value'),
					changeable: starbox.hasClass('unchangeable') ? false : starbox.hasClass('clickonce') ? 'once' : true,
					ghosting: starbox.hasClass('ghosting'),
					autoUpdateAverage: starbox.hasClass('autoupdate'),
					buttons: starbox.hasClass('smooth') ? false : starbox.attr('data-button-count') || 5,
					stars: starbox.attr('data-star-count') || 5
					}).bind('starbox-value-changed', function(event, value) {
					if(starbox.hasClass('random')) {
					var val = Math.random();
					starbox.next().text(' '+val);
					return val;
					} 
				})
			});
		});
		</script>
<!---//End-rate---->
</head>
<body>
	<!-- 상단 메뉴 -->
<!--header-->
<div class="header">
<div class="container">
		<div class="head">
			<div class=" logo">
				<a href="${root }"><img src="${root }/B_user/images/logo.png" alt=""></a>	
			</div>
		</div>
	</div>
	<div class="header-top">
		<div class="container">
		<div class="col-sm-5 col-md-offset-2  header-login">
					<ul >
					<c:choose>
						<c:when test="${empty id }">
							<li><a href="${root }/user/login?banner=Login">Login</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="${root }/user/logout">Logout</a></li>
							<c:choose>
								<c:when test="${auth eq 'A' }">
									<li><a href="${root }/admin">admin</a></li>
								</c:when>
								<c:otherwise>
									<li style="color:#d9d9d9; font-size: 2px; ">환영합니다 ${id }님</li>
								</c:otherwise>
							</c:choose>
						</c:otherwise>
					</c:choose>
					</ul>
				</div>
				
			<div class="col-sm-5 header-social">		
					<ul >
						<li><a href="#"><i></i></a></li>
						<li><a href="#"><i class="ic1"></i></a></li>
						<li><a href="#"><i class="ic2"></i></a></li>
						<li><a href="#"><i class="ic3"></i></a></li>
						<li><a href="#"><i class="ic4"></i></a></li>
					</ul>
					
			</div>
				<div class="clearfix"> </div>
		</div>
		</div>
		
		<div class="container">
		
			<div class="head-top">
			
		 <div class="col-sm-8 col-md-offset-2 h_menu4">
				<nav class="navbar nav_bottom" role="navigation">
 
 <!-- Brand and toggle get grouped for better mobile display -->
  <div class="navbar-header nav_2">
      <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
     
   </div> 
   <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
        <ul class="nav navbar-nav nav_1">
            <li><a class="color" href="${root }">Home</a></li>
            
            <li class="dropdown mega-dropdown active">
			    <a class="color1" href="#" class="dropdown-toggle" data-toggle="dropdown">Women<span class="caret"></span></a>				
				<div class="dropdown-menu ">
                    <div class="menu-top">
						<div class="col1">
							<div class="h_nav">
								<h4>원피스/정장</h4>
									<ul>
										<li><a href="${root }/pdt/list?ccode=BBB&banner=Products">원피스</a></li>
										<li><a href="${root}/pdt/list?ccode=BBC&banner=Products">정장</a></li>
										
									</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>상의</h4>
								<ul>
										<li><a href="${root}/pdt/list?ccode=BCB&banner=Products">티셔츠</a></li>
										<li><a href="${root}/pdt/list?ccode=BCC&banner=Products">맨투맨/후드티</a></li>
										<li><a href="${root}/pdt/list?ccode=BCD&banner=Products">블라우스</a></li>
										<li><a href="${root}/pdt/list?ccode=BCE&banner=Products">셔츠</a></li>
									</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>하의</h4>
									<ul>
										<li><a href="${root}/pdt/list?ccode=BDB&banner=Products">청바지</a></li>
										<li><a href="${root}/pdt/list?ccode=BDC&banner=Products">바지/레깅스</a></li>
										<li><a href="${root}/pdt/list?ccode=BDD&banner=Products">스커트</a></li>
										<li><a href="${root}/pdt/list?ccode=BDE&banner=Products">반바지</a></li>
									</ul>	
								
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>아우터/니트</h4>
								<ul>
									<li><a href="${root}/pdt/list?ccode=BEB&banner=Products">가디건</a></li>
									<li><a href="${root}/pdt/list?ccode=BEC&banner=Products">자켓/코트</a></li>
									<li><a href="${root}/pdt/list?ccode=BED&banner=Products">점퍼/야상/패딩</a></li>
									<li><a href="${root}/pdt/list?ccode=BEE&banner=Products">니트</a></li>
									<li><a href="${root}/pdt/list?ccode=BEF&banner=Products">조끼</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>테마의류</h4>
								<ul>
									<li><a href="${root}/pdt/list?ccode=BFB&banner=Products">수영복/비치웨어</a></li>
									<li><a href="${root}/pdt/list?ccode=BFC&banner=Products">한복</a></li>
									<li><a href="${root}/pdt/list?ccode=BFD&banner=Products">테마의류</a></li>
								</ul>	
							</div>							
						</div>
						<div class="clearfix"></div>
					</div>                  
				</div>				
			</li>
			<li class="dropdown mega-dropdown active">
			    <a class="color2" href="#" class="dropdown-toggle" data-toggle="dropdown">Men<span class="caret"></span></a>				
				<div class="dropdown-menu mega-dropdown-menu">
                    <div class="menu-top">
						<div class="col1">
							<div class="h_nav">
								<h4>아우터</h4>
									<ul>
										<li><a href="${root}/pdt/list?ccode=CBB&banner=Products">점퍼/야상/패딩</a></li>
										<li><a href="${root}/pdt/list?ccode=CBC&banner=Products">코트</a></li>
										<li><a href="${root}/pdt/list?ccode=CBD&banner=Products">자켓</a></li>
									</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>상의</h4>
								<ul>
										<li><a href="${root}/pdt/list?ccode=CCB&banner=Products">긴팔티셔츠</a></li>
										<li><a href="${root}/pdt/list?ccode=CCC&banner=Products">교복</a></li>
										<li><a href="${root}/pdt/list?ccode=CCD&banner=Products">맨투맨/후드티</a></li>
										<li><a href="${root}/pdt/list?ccode=CCE&banner=Products">캐주얼셔츠</a></li>
										<li><a href="${root}/pdt/list?ccode=CCF&banner=Products">반팔티셔츠</a></li>
									</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>하의/트레이닝</h4>
									<ul>
										<li><a href="${root}/pdt/list?ccode=CDB&banner=Products">청바지</a></li>
										<li><a href="${root}/pdt/list?ccode=CDC&banner=Products">캐주얼바지</a></li>
										<li><a href="${root}/pdt/list?ccode=CDD&banner=Products">반바지</a></li>
										<li><a href="${root}/pdt/list?ccode=CDE&banner=Products">트레이닝</a></li>
									</ul>	
								
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>니트</h4>
								<ul>
									<li><a href="${root}/pdt/list?ccode=CEB&banner=Products">니트</a></li>
									<li><a href="${root}/pdt/list?ccode=CEC&banner=Products">가디건/조끼</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>테마의류</h4>
								<ul>
									<li><a href="${root}/pdt/list?ccode=CFB&banner=Products">수영복/비치웨어</a></li>
									<li><a href="${root}/pdt/list?ccode=CFC&banner=Products">한복</a></li>
									<li><a href="${root}/pdt/list?ccode=CFD&banner=Products">테마의류</a></li>
								</ul>	
							</div>							
						</div>
						<div class="clearfix"></div>
					</div>    
					              
				</div>				
			</li>
			<li class="dropdown mega-dropdown active">
			    <a class="color1" href="#" class="dropdown-toggle" data-toggle="dropdown">Service<span class="caret"></span></a>				
				<div class="dropdown-menu " style="width:10px;">
                    <div class="menu-top">
						<div class="col1">
							<div class="h_nav">
								<ul>
									<li><a href="${root }/admin_board/faq?banner=자주묻는 질문">자주묻는 질문</a></li>
									<li><a href="${root }/user_board/list?banner=Q&A">Q&A</a></li>
									<li><a href="${root }/admin_board/live?banner=실시간 상담">실시간 상담</a></li>
									<li><a href="${root }/admin_board/email?banner=E-mail문의">E-mail 문의</a></li>
									<li><a href="${root }/admin_board/list?banner=공지사항">공지사항</a></li>
								</ul>	
							</div>							
						</div>
						<div class="clearfix"></div>
					</div>                  
				</div>				
			</li>
			<li class="dropdown mega-dropdown active">
			    <a class="color1" href="#" class="dropdown-toggle" data-toggle="dropdown">MyPage<span class="caret"></span></a>				
				<div class="dropdown-menu " style="width:10px;">
                    <div class="menu-top">
						<div class="col1">
							<div class="h_nav">
								<ul>
									<li><a href="${root }/user/read?banner=나의 정보">나의 정보</a></li>
									<li><a href="${root }/order/list?banner=나의 구매내역">나의 구매내역</a></li>
									
								</ul>	
							</div>							
						</div>
						<div class="clearfix"></div>
					</div>                  
				</div>				
			</li>
			<li><a class="color4" href="${root }/admin_board/map?banner=About Us">About Us</a></li>
        </ul>
     </div><!-- /.navbar-collapse -->

</nav>
			</div>
			<div class="col-sm-2 search-right">
				<ul class="heart">
				<li>
				<a href="wishlist.html" >
				<span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
				</a></li>
				<li><a class="play-icon popup-with-zoom-anim" href="#small-dialog"><i class="glyphicon glyphicon-search"> </i></a></li>
					</ul>
					<div class="cart box_1">
						<a href="${root }/cart/list?banner=Cart">
						<h3> <div class="total">
							<span class="simpleCart_total"></span></div>
							<img src="${root }/B_user/images/cart.png" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

					</div>
					<div class="clearfix"> </div>
					
						<!----->

						<!---pop-up-box---->					  
			<link href="${root }/B_user/css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
			<script src="${root }/B_user/js/jquery.magnific-popup.js" type="text/javascript"></script>
			<!---//pop-up-box---->
			<div id="small-dialog" class="mfp-hide">
				<div class="search-top">
					<div class="login-search">
						<input type="submit" value="">
						<input type="text" value="Search.." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search..';}">		
					</div>
					<p>Attrait</p>
				</div>				
			</div>
		 <script>
			$(document).ready(function() {
			$('.popup-with-zoom-anim').magnificPopup({
			type: 'inline',
			fixedContentPos: false,
			fixedBgPos: true,
			overflowY: 'auto',
			closeBtnInside: true,
			preloader: false,
			midClick: true,
			removalDelay: 300,
			mainClass: 'my-mfp-zoom-in'
			});
																						
			});
		</script>		
						<!----->
			</div>
			<div class="clearfix"></div>
		</div>	
	</div>	
</div>
	<!-- 상단 메뉴 끝 -->

</body>
</html>
