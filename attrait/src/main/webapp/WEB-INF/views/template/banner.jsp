<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--banner-->
<div class="banner-top">
	<div class="container">
		<h1>${param.banner }</h1>
		<em></em>
		<h2><a href="${root }">Home</a><label>/</label>${param.banner }</h2>
	</div>
</div>
</body>
</html>