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
    <title>All Users</title>
</head>
<body>

<c:forEach items="${users}" var="user">
    <h1>${user.name}</h1>
</c:forEach>
</body>
</html>
