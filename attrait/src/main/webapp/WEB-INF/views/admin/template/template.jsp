<%@ page contentType="text/html; charset=UTF-8" %>
 <%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<%--  <% String CONTENT_PAGE = (String)request.getAttribute("CONTENT_PAGE"); %>--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="title"/></title>
    
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <meta name="description" content="">
   <meta name="author" content="">

   <title>Startmin - Bootstrap Admin Theme</title>

   <!-- Bootstrap Core CSS -->
   <link href="${root }/B_admin/css/bootstrap.min.css" rel="stylesheet">

   <!-- MetisMenu CSS -->
   <link href="${root }/B_admin/css/metisMenu.min.css" rel="stylesheet">

   <!-- Timeline CSS -->
   <link href="${root }/B_admin/css/timeline.css" rel="stylesheet">

   <!-- Custom CSS -->
   <link href="${root }/B_admin/css/startmin.css" rel="stylesheet">

   <!-- Morris Charts CSS -->
   <link href="${root }/B_admin/css/morris.css" rel="stylesheet">

   <!-- Custom Fonts -->
   <link href="${root }/B_admin/css/font-awesome.min.css" rel="stylesheet" type="text/css">

   <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
   <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
   <!--[if lt IE 9]>
   <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
   <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
   <![endif]-->
   
   
<!-- jQuery -->
<script src="${root }/B_admin/js/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="${root }/B_admin/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="${root }/B_admin/js/metisMenu.min.js"></script>

<!-- Custom Theme JavaScript -->
<script src="${root }/B_admin/js/startmin.js"></script>
    
</head>
<body leftmargin="0" topmargin="0">
<div id="wrapper">

 <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="navbar-header">
            <a class="navbar-brand" href="${root }/admin">Attrait_Admin</a>
        </div>

        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>

<!-- 상단 메뉴 -->
<tiles:insertAttribute name="top"/>
<!-- 상단 메뉴 끝 -->

<!-- 사이드 바 -->
<tiles:insertAttribute name="side"/>
<!-- 사이드 바 -->
 
 </nav>
<!-- 내용 시작 -->
<tiles:insertAttribute name="body"/>
<!-- 내용 끝 -->
 
</div>
</body>
</html>

