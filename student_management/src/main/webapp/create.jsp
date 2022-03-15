<%--
  Created by IntelliJ IDEA.
  User: tubac
  Date: 27/02/2022
  Time: 01:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create new student</h1>
<form action="/students?param=createPost" method="post">
    <label>ID:
        <input type="text" name="id">
    </label>
    <br>

    <label>Name:
        <input type="text" name="name">
    </label>
    <br>

    <label>Age:
        <input type="text" name="age">
    </label>
    <br>

    <label>Address:
        <input type="text" name="address">
    </label>
    <br>

    <label>Avg:
        <input type="text" name="avg">
    </label>
    <br>

    <button type="submit">Create</button>
</form>
</body>
</html>
