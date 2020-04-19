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

<form:form action="processForm" modelAttribute="customer">
    First Name : <form:input path="firstName"></form:input><br><br>
    Last Name (*): <form:input path="lastName"></form:input>
    <form:errors path="lastName" cssClass="formError"></form:errors>
    <br><br>
    <input type="submit" value="submit">
</form:form>
</body>
</html>
