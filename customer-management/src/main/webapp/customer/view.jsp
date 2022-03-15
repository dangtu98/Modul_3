<%--
  Created by IntelliJ IDEA.
  User: tubac
  Date: 02/03/2022
  Time: 09:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Customers</title>
</head>
<body>
<h1>Customer detail</h1>
<p>
    <a href="customers">Back To Customer List</a>
</p>
<table>
    <tr>
        <td>Name:</td>
        <td>${requestScope["customer"].getName()}</td>
    </tr>
    <tr>
        <td>Email:</td>
        <td>${requestScope["customer"].getEmail()}</td>
    </tr>
    <tr>
        <td>Address:</td>
        <td>${requestScope["customer"].getAddress()}</td>
    </tr>
</table>
</body>
</html>
