<%--
  Created by IntelliJ IDEA.
  User: tubac
  Date: 02/03/2022
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User management</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="users?action=create">ADD NEW USER</a>
    </h2>
</center>

<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List Of users</h2></caption>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>EMAIL</th>
            <th>COUNTRY</th>
            <th>ACTION</th>
        </tr>
        <c:forEach items="${listUser}" var="user">
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.email}"/></td>
                <td><c:out value="${user.country}"/></td>
                <td>
                    <a href="users?action=edit&id=${user.id}">EDIT</a>
                    <a href="users?action=delete$id=${user.id}">DELETE</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
