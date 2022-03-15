<%--
  Created by IntelliJ IDEA.
  User: tubac
  Date: 28/02/2022
  Time: 09:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/cities?action=createPost" method="post">
    <label> ID:
        <input type="text" name="id">
    </label>
    <label> Name:
        <input type="text" name="name">
    </label>
    <label> Popular:
        <input type="text" name="popular">
    </label>
    <label> Area:
        <input type="text" name="area">
    </label>
    <label> GDP:
        <input type="text" name="GDP">
    </label>
    <label> Country:
        <select name ="country">
            <option value="VN">VN</option>
            <option value="TL">TL</option>
            <option value="NB">NB</option>
        </select>
    </label>
    <button type="submit">Create</button>
</form>
</body>
</html>
