<%--
  Created by IntelliJ IDEA.
  User: tubac
  Date: 17/02/2022
  Time: 09:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>currency-converter</title>
  </head>
  <body>
  <h2>Currency-Converter</h2>

  <form method="get" action="converter.jsp">

    <label>Rate :</label>
    <br>
    <input type="text" name="rate" placeholder="RATE" value="220000">
    <br>
    <label>USD :</label>
    <br>
    <input type="text" name="usd" placeholder="USD" value="0">
    <br>
    <input type="submit" id="submit" value="CONVERTER">

  </form>
  </body>
</html>
