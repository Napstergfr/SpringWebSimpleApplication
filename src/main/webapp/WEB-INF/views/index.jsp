<%--
  Created by IntelliJ IDEA.
  User: gfr00
  Date: 8/4/2021
  Time: 1:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Welcome</title>
</head>
<body>

<c:forEach items="${names}" var="name">
    <c:if test="${name=='Golam'}">
        <h1>My man ${name}</h1>
    </c:if>
    <c:choose>
        <c:when test="${name=='Rabbi'}">
            <h1>Boss ${name}</h1>
        </c:when>
        <c:otherwise>
            <h1>Who is this!</h1>
        </c:otherwise>
    </c:choose>
</c:forEach>
</body>
</html>
