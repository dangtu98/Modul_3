<%--
  Created by IntelliJ IDEA.
  User: tubac
  Date: 17/02/2022
  Time: 00:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <style type="text/css">
    .login{
      height:180px; width:230px;
      margin:0;
      padding:10px;
      border:1px #CCC solid;
    }
    .login input {
      padding:5px; margin:5px
    }
  </style>
  <body>
  <form method="get" action="/login">
    <div class="login">
      <h2>Login</h2>
      <label><input type="text" name="username" size="30" placeholder="username"></label>
      <label><input type="password" name="password" size="30" placeholder="password"></label>
      <label><input type="submit" value="sign in"></label>
    </div>
  </form>
  </body>
</html>
