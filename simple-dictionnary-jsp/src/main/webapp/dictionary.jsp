<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: tubac
  Date: 17/02/2022
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Map <String, String> dic = new HashMap<>();

%>

<%
    dic.put("hello","xin chao");
    dic.put("how","the nao");
    dic.put("book","quyen sach");
    dic.put("computer","may tinh");

    String search = request.getParameter("Search");
    String result = dic.get(search);

    System.out.println(result);

%>
</body>
</html>
