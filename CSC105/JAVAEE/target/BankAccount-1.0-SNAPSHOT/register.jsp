<%--
  Created by IntelliJ IDEA.
  User: mixko
  Date: 28/4/2021 AD
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register to bank</title>
</head>
<body>
<form action="RegisterServlet" method="post">
    <p>Username</p>
    <input type="text" placeholder="name" required name="username">
    <p>Password</p>
    <input type="password" placeholder="password" required name="password">
    <input type="submit">
</form>

</body>
</html>
