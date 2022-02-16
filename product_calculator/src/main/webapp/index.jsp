<%--
  Created by IntelliJ IDEA.
  User: tubac
  Date: 17/02/2022
  Time: 01:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>product</title>
  </head>
  <body>
  <form method="post" action="/display-discount">
    <label>Product Description :</label>
    <input type="text" name="desc" >
    <br>
    <br>
    <label>List Price :</label>
    <input type="text" name="list" >
    <br>
    <br>
    <label>Discount Percent :</label>
    <input type="text" name="per" >
    <br>
    <br>
    <input type="submit" id="submit" value="DISCOUNT">
  </form>
  </body>
</html>
