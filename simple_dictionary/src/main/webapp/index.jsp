<%--
  Created by IntelliJ IDEA.
  User: tubac
  Date: 17/02/2022
  Time: 00:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
  <h1>VietNam Dictionary</h1>
  <form method="post" action="/translate">
    <input type="text" name="txtSearch" placeholder="Enter your word: ">
    <input type="submit" id="submit" value="Search">
  </form>
  </body>
</html>
