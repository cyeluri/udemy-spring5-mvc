<%--
  Created by IntelliJ IDEA.
  User: CYeluri
  Date: 4/13/20
  Time: 7:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World - Input Form</title>
    <link href="${pageContext.request.contextPath}/resources/css/default.css" rel="stylesheet" type="text/css">
</head>
<body>
<img src="${pageContext.request.contextPath}/resources/images/spring-logo.png" class="springImgStyle">
<br>
    <form action="processFormV2" method="get">
        <input type="text" name="studentName" placeholder="Whats your name?">
        <input type="submit">
    </form>
</body>
</html>
