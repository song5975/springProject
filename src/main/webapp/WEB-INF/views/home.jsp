<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% pageContext.setAttribute("name2", "홍길동"); %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Home</title>
    <jsp:include page="/include/bs4.jsp" />
    <script>
        'use strict';

        function ageCheck() {
            let age = myform.age.value;
            location.href = "${ctp}/?age="+age;
        }
    </script>
</head>
<body>
<div class="container">
    <h1>
        Hello world!  
    </h1>

    <P>  The time on the server is ${serverTime}. </P>
    <hr/>
    <p style="text-align:center">
        <a href="${ctp}/atom/a1?name=${name1}">a1.jsp(/a1)</a> |
        <a href="${ctp}/atom/atom1?name=${name2}">a1.jsp(/atom1)</a> |
        <a href="${ctp}/atom/a2?name=${name1}">a2.jsp</a> |
        <a href="${ctp}/atom/a3?name=${name2}">a3.jsp</a>
    </p>
    <div>
        <form name="myform" method="post" action="${ctp}/aCheck">
            <div>성명 : 
                <input type="text" name="name" value="홍길동"/>
            </div>
            <div>나이 : 
                <input type="number" name="age" value="20" min="0" max="99"/>
            </div>
            <div>
                <input type="submit" value="나이체크(Post)" />
                <input type="button" value="나이체크(Get)" onclick="ageCheck()" />
                <input type="button" value="다시부르기" onclick="location.href='${ctp}/';"/>
            </div>
        </form>
    </div>
    <hr/>
    <div>
        <c:if test="${!empty name && !empty age}">
            넘어온 이름은? ${name}<br/>
            넘어온 나이는? ${age}<br/>
            <a href="${ctp}/atom/${url}">이동하기</a>
        </c:if>
    </div>
    <hr/>
    <p>
        <a href="${ctp}/btom/b1" class="btn btn-success">b1호출</a> |
        <a href="${ctp}/btom/b2" class="btn btn-success">b2호출</a> |
        <a href="${ctp}/btom/b3" class="btn btn-success">b3호출</a> |
        <a href="${ctp}/btom/b4" class="btn btn-success">b4호출</a> |
        <a href="${ctp}/btom/b5" class="btn btn-success">b5호출</a> |
        <a href="${ctp}/btom/b6" class="btn btn-success">b6호출</a> |
        <a href="${ctp}/btom/b7" class="btn btn-success">b7호출</a> |
        <a href="${ctp}/btom/b8" class="btn btn-success">b8호출</a> |
    </p>
    <hr/>
    <p>
        <a href="${ctp}/ctom/c1" class="btn btn-primary">c1호출</a> |
    </p>
</div>
</body>
</html>
