<%--
  Created by IntelliJ IDEA.
  User: gfr00
  Date: 8/4/2021
  Time: 10:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Name Form</title>
</head>
<body>
    <form:form action="${pageContext.request.contextPath}/users/add" modelAttribute="user">
        <form:input path="name" />
        <input type="submit" value="submit">
    </form:form>
</body>
</html>
