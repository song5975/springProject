<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>b8.jsp</title>
	<jsp:include page="/include/bs4.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>이곳은 btom 폴더의 b8.jsp 입니다.</h2>
	<hr/>
	<p>
		<a href="${ctp}/" class="btn btn-warning">HOME으로</a> |
		<a href="${ctp}/ctom/c1Service" class="btn btn-warning">c1으로</a> |
		<a href="${ctp}/ctom/c1Service2" class="btn btn-warning">c1으로2</a> |
	</p>
</div>
<p><br/></p>
</body>
</html>