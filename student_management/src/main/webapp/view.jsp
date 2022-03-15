<%--
  Created by IntelliJ IDEA.
  User: tubac
  Date: 26/02/2022
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>All Students</h1>
<button><a href="/students?param=createGet">Create New Student</a></button>
<button><a href="/students?param=sort">Sắp Xếp</a></button>
<button><a href="/students?param=great">Sv giỏi</a></button>
<br>
<br>
<form action="/students?param=search" method="post">
    <label><input type="text" name="search-name"></label>
    <button type="submit">Search</button>
</form>
<table>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Age</td>
        <td>Address</td>
        <td>Average</td>
        <td colspan="2">Action</td>
    </tr>
    <c:forEach items="${students}" var="student">
        <tr>
            <td>
                    ${student.getId()}
            <td>

            <td>
                    ${student.getName()}
            <td>

            <td>
                    ${student.getAge()}
            <td>

            <td>
                    ${student.getAddress()}
            <td>

            <td>
                    ${student.getAvg()}
            <td>

            <td>
                <button><a href="">Edit</a></button>
            </td>

            <td>
                <button><a href="">Delete</a></button>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
