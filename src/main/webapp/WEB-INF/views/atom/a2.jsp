<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>a2.jsp</title>
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>이곳은 a2.jsp입니다.</h2>
	<hr/>
	<p style="text-align:center">
		<a href="${ctp}/">home</a> |
		<a href="${ctp}/atom/a1">a1.jsp</a> |
		<a href="${ctp}/atom/a3">a3.jsp</a>
	</p>
	<hr/>
	<h2>넘어온 이름 : ${name}</h2>
	<h3>성별 : ${gender}</h3>
</div>
<p><br/></p>
</body>
</html>