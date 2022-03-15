<%--
  Created by IntelliJ IDEA.
  User: tubac
  Date: 28/02/2022
  Time: 09:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>All City</h1>
<a href="/cities?action=createGet">Create New City</a>
<c:if test="${requestScope['listcity'].isEmpty()} == false">
    <h2 style="color: red">Không có sản phẩm nào</h2>
</c:if>

<c:if test="${requestScope['listcity'].isEmpty() == false}">
    <table>
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Popular</td>
            <td>Area</td>
            <td>GDP</td>
            <td>Country</td>
            <td colspan="2">Action</td>
        </tr>
        <c:forEach items="${listcity}" var="city">
            <tr>
                <td>${city.getId()}</td>
                <td>${city.getName()}</td>
                <td>${city.getPopular()}</td>
                <td>${city.getArea()}</td>
                <td>${city.getGDP()}</td>
                <td>${city.getCountry()}</td>
                <td><a href="/cities?action=editGet&id=${city.getId()}">Edit</a></td>
                <td><a href="/cities?action=delete&id=${city.getId()}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
