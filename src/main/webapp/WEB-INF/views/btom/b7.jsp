<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>b7.jsp</title>
    <jsp:include page="/include/bs4.jsp" />
</head>
<body>
    <p><br/></p>
    <div class="container">
        <h2>이곳은 btom폴더의 b7.jsp 입니다.</h2>
        <hr/>
        <div>
            <form method="post">
                <div>성명 : <input type="text" name="name" id="name" value="홍길동" class="form-control"/></div>
                <div>나이 : <input type="number" name="age" id="age" value="25" min="0" max="99" class="form-control mb-2"/></div>
                <div>아이디 : <input type="text" name="mid" value="hkd1234" class="form-control"/></div>
                <div>비밀번호 : <input type="password" name="pwd" value="1234" class="form-control"/></div>
                <div>성별 : 
                	<input type="radio" name="gender" value="남자"/>남자 &nbsp;
                	<input type="radio" name="gender" value="여자" checked/>여자
                </div>
                <div>주소 : <input type="text" name="address" value="청주" class="form-control mb-2"/></div>
                <div><input type="submit" value="전송" class="btn btn-secondary"/></div>
                <input type="hidden" name="job" value="학생" />
                <input type="hidden" name="wDate" value="<%=new java.util.Date() %>" />
            </form>
        </div>
        <hr/>
        <div>  코드 열어서 주석 확인<br/>
            <%-- <c:if test="${!empty name && !empty age}"> --%>
            	넘어온 값 : 
                ${vo.name} / ${vo.age} / ${vo.mid} / ${vo.pwd} / ${vo.gender} / ${vo.address} / ${vo.job} / ${vo.WDate}
                <%-- 두 번째 글짜가 대문자면 첫 번째 글자도 대문자로 해야한다. ${vo.wDate} --%>
                <%-- JSTL에서는 Java 빈의 속성(property)을 참조할 때 첫 글자가 소문자인 경우에는 자동으로 첫 글자를 대문자로 바꿔주는 규칙이 적용 --%>
                
                <%-- age -> getAge(); 일 때 필드명은 age, wDate -> getWDate(); 일 때 필드명은 WDate (그래서 vo 에서 값을 가져올 때는 ${vo.WDate} --%>
            <%-- </c:if> --%>
        </div>
        <hr/>
        <p>
            <a href="${ctp}/" class="btn btn-warning">Home으로</a>
        </p>
    </div>
    <p><br/></p>
</body>
</html>
