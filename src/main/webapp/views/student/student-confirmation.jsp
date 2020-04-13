<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: CYeluri
  Date: 4/13/20
  Time: 5:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Form</title>
    <link href="${pageContext.request.contextPath}/resources/css/default.css" rel="stylesheet" type="text/css">

</head>
<body>
<img src="${pageContext.request.contextPath}/resources/images/spring-logo.png" class="springImgStyle">
Student confirmation : ${student.firstName}, ${student.lastName}
<br>
Country : ${student.country}
</body>
</html>
