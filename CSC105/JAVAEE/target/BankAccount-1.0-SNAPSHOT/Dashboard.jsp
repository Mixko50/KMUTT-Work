<%--
  Created by IntelliJ IDEA.
  User: mixko
  Date: 28/4/2021 AD
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Account Dashboard</title>
</head>
<body>
AccountNumber : ${account.accountNumber} <br>
AccountName : ${account.accountName} <br>
Amount : ${account.amount} <br>
<br>
<h2>Deposit money</h2>
<form method="post" action="DepositServlet">
    <input type="number" placeholder="type your number" name="number">
    <input type="submit">
</form>

Deposit : ${amount}


</body>
</html>
