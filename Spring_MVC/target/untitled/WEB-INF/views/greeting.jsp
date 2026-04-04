<%--
  Created by IntelliJ IDEA.
  User: avhad
  Date: 4/4/2026
  Time: 1:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is the greeting page </title>
</head>
<body>

<h1> @  Model data rendering  @ </h1>
<%=request.getAttribute("message")%>



</body>
</html>
