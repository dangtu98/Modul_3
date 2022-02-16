<%--
  Created by IntelliJ IDEA.
  User: tubac
  Date: 17/02/2022
  Time: 00:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
  </head>
  <body>
  <h1>Currency Converter</h1>
  <form method="get" action="/convert">
    <label>Rate : </label>
    <br/>
    <input type ="text" name="rate" placeholder="RATE" value="22000">
    <br/>
    <label>USD : </label>
    <br/>
    <input type="text" name="usd" placeholder="USD" value="0">
    <br/>
    <input type="submit" id="submit" value="Converter">

  </form>
  </body>
</html>
