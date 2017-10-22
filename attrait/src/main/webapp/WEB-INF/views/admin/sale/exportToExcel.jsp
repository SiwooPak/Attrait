<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String filename = request.getAttribute("filename").toString();
	response.setHeader("Content-Type", "application/vnd.ms-xls");
	response.setHeader("Content-Disposition", "inline; filename=Monitoring_" + filename + ".xls");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Query's Result to Excel</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>매출코드</th>
			<th>매출일</th>
			<th>상품코드</th>
			<th>상품명</th>
			<th>수량</th>
			<th>총매출</th>
			<th>원가</th>
			<th>부가세</th>
			<th>순수매출</th>
		</tr>
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
	</table>
</body>
</html>