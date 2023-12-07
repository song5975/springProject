<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>c1.jsp</title>
	<jsp:include page="/include/bs4.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>이곳은 c1.jsp 파일입니다.</h2>
	<p>view 자원을 관리하는 resources 학습</p>
	<hr/>
	<div><img src="/include/1.jpg" width="150px" /> (X) </div>
	<div><img src="/resources/2.jpg" width="150px" /> (X) </div>
	<!-- 정확한 경로를 적어줘야한다. ${ctp} -->
	<div><img src="${ctp}/resources/2.jpg" width="150px" /> (O) </div>
	<div><img src="${ctp}/resources/images/3.jpg" width="150px" /> (O) </div>
	<div><img src="${ctp}/resources/images/temp/4.jpg" width="150px" /> (O) </div>
	
	
	<!-- servlet-context와 함께 확인(<resources mapping="/images/**" location="/resources/images/" />) -->
	<div><img src="${ctp}/images/5.jpg" width="150px" /> (O) </div>
	<div><img src="${ctp}/board/1.jpg" width="150px" /> (O) </div>
	<div><img src="${ctp}/board/2.jpg" width="150px" /> (O) </div>
	<div><img src="${ctp}/pds/4.jpg" width="150px" /> (O) </div>
	<div><img src="${ctp}/pds/5.jpg" width="150px" /> (O) </div>
	
	
	<!-- images에 mapping이 걸린 것. images/** 의 * 2개는 아래 파일을 모두 다 본다. 따라서 ${ctp}/resources/images/pds/5.jpg 가 되는 것 -->
	<div><img src="${ctp}/images/pds/5.jpg" width="150px" /> (O) </div>
    <hr/>
    <p>
        <a href="${ctp}/" class="btn btn-success">home</a> |
    </p>
</div>
<p><br/></p>
</body>
</html>