<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome to Bank</title>
</head>
<body>
<h1>Welcome to my Bank</h1>
<br/>
<%--Create Login--%>
<form action="LoginServlet" method="post">
    <p>Username</p>
    <input type="text" placeholder="name" required name="username"><br/>
    <p>Password</p><br/>
    <input type="password" placeholder="password" required name="password"><br/>
    <input type="submit">
</form>

<a href="register.jsp" >Not a member ? Register here!</a>
</body>
</html>