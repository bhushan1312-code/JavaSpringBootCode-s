<%--
  Created by IntelliJ IDEA.
  User: avhad
  Date: 4/6/2026
  Time: 12:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register_param</title>
</head>
<body>

<%= request.getAttribute("email")%>

<%= request.getAttribute("password")%>

<%= request.getAttribute("passwordRepeat")%>


<h2> Registration Successfull </h2>
</body>
</html>
epeat