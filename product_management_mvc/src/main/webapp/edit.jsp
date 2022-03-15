<%--
  Created by IntelliJ IDEA.
  User: tubac
  Date: 04/03/2022
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <a href="products">Danh Sách Sản Phẩm</a>
    <h1>Sửa Sản Phẩm </h1>
    <form method="post">
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Mã sản phẩm:</label>
            <input type="text" class="form-control" id="exampleInputEmail1" name="id" value="${product.id}">
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Tên sản phẩm:</label>
            <input type="text" class="form-control" id="exampleInputPassword1" name="name" value="${product.name}">
        </div>
        <div class="mb-3">
            <label for="price" class="form-label">Giá sản phẩm:</label>
            <input type="text" class="form-control" id="price" name="price" value="${product.price}">
        </div>
        <div class="mb-3">
            <label for="description" class="form-label">Mô tả sản phẩm:</label>
            <input type="text" class="form-control" id="description" name="description" value="${product.description}">
        </div>
        <button type="submit" class="btn btn-danger">Thêm Mới</button>
    </form>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</div>
</body>
</html>
