<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>b2.jsp</title>
    <jsp:include page="/include/bs4.jsp" />
</head>
<body>
    <p><br/></p>
    <div class="container">
        <h2>이곳은 btom폴더의 b2.jsp 입니다.</h2>
        <%-- <div><a href="${ctp}/btom/b2" class="btn btn-info">b2호출</a></div> --%>
        <div><a href="b2?name=btom" class="btn btn-info">b2호출</a></div>
        <hr/>
        <div>
            <c:if test="${!empty name && !empty age}">넘어온 값 : 
                ${name} / ${age}
            </c:if>
        </div>
        <hr/>
        <div>
            <!-- <form name="myform" method="post" action="b2Ok"> -->
            <form method="post">
                <div>성명 : <input type="text" name="name" id="name" value="${name}" class="form-control"/></div>
                <div>나이 : <input type="number" name="age" id="age" value="${age}" min="0" max="99" class="form-control mb-2"/></div>
                <div><input type="submit" value="전송" class="btn btn-secondary"/></div>
            </form>
        </div>
        <hr/>
        <p>
            <a href="${ctp}/" class="btn btn-warning">Home으로</a>
        </p>
    </div>
    <p><br/></p>
</body>
</html>
