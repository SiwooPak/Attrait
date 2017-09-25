<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="util" uri="/ELFunctions" %>

<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<c:set var="upDir" value='<%=application.getRealPath("/member/storage") %>'></c:set>

<c:if test="${not empty sessionScope.id && sessionScope.grade == 'A' }">
	<c:set var="col" value="${param.col }"></c:set>
	<c:set var="word" value="${param.word }"></c:set>
	<c:set var="nowPage" value="${param.nowPage }"></c:set>
</c:if>
