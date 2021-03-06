<%--
  Created by IntelliJ IDEA.
  User: tubac
  Date: 10/03/2022
  Time: 09:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Tempusdominus Bootstrap 4 -->
    <link rel="stylesheet" href="../plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="../plugins/icheck-bootstrap/icheck-bootstrap.min.css">
    <!-- JQVMap -->
    <link rel="stylesheet" href="../plugins/jqvmap/jqvmap.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="../dist/css/adminlte.min.css">
    <!-- overlayScrollbars -->
    <link rel="stylesheet" href="../plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
    <!-- Daterange picker -->
    <link rel="stylesheet" href="../plugins/daterangepicker/daterangepicker.css">
    <!-- summernote -->
    <link rel="stylesheet" href="../plugins/summernote/summernote-bs4.min.css">
</head>
<body>
<div class="wrapper">

    <aside class="main-sidebar sidebar-dark-primary elevation-4">
        <!-- Brand Logo -->
        <a href="index3.html" class="brand-link">
            <img src="../dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
                 style="opacity: .8">
            <span class="brand-text font-weight-light">AdminLTE 3</span>
        </a>

        <!-- Sidebar -->
        <div class="sidebar">
            <!-- Sidebar user panel (optional) -->
            <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                <div class="image">
                    <img src="../dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
                </div>
                <div class="info">
                    <a href="#" class="d-block">Alexander Pierce</a>
                </div>
            </div>

            <!-- SidebarSearch Form -->
            <div class="form-inline">
                <form action="/products">
                    <div class="input-group" data-widget="sidebar-search">
                        <input class="form-control form-control-sidebar" name="q" type="search" placeholder="Search"
                               aria-label="Search">
                        <div class="input-group-append">
                            <button class="btn btn-sidebar">
                                <i class="fas fa-search fa-fw"></i>
                            </button>
                        </div>
                    </div>
                </form>
            </div>

            <!-- Sidebar Menu -->
            <nav class="mt-2">
                <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu"
                    data-accordion="false">
                    <!-- Add icons to the links using the .nav-icon class
                         with font-awesome or any other icon font library -->
                    <li class="nav-item">
                        <a href="/products" class="nav-link">
                            <i class="nav-icon fas fa-th"></i>
                            <p>
                                Qu???n l?? Danh S??ch
                            </p>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a href="/categories" class="nav-link">
                            <i class="nav-icon fas fa-th"></i>
                            <p>
                                Qu???n l?? danh m???c
                            </p>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a href="/products?action=create" class="nav-link">
                            <i class="nav-icon fas fa-th"></i>
                            <p>
                                T???o S???n S??ch M???i
                            </p>
                        </a>
                    </li>
                </ul>
            </nav>
            <!-- /.sidebar-menu -->
        </div>
        <!-- /.sidebar -->
    </aside>
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <!-- /.content-header -->

        <!-- Main content -->
        <section class="content">
            <div class="container-fluid">
                <div class="container">
                    <h1>C???P NH???T S???N PH???M</h1>
                    <a href="stories">To Back</a>
                    <form action="/products?action=edit&id=${stories.id}" method="post">
                        <div class="mb-3">
                            <label for="exampleInputPassword1" class="form-label">T??n</label>
                            <input type="text" class="form-control" id="exampleInputPassword1" name="name"
                                   value="${stories.name}">
                        </div>
                        <div class="mb-3">
                            <label for="price" class="form-label">Gi?? Lo???i</label>
                            <input type="text" class="form-control" id="price" name="price" value="${stories.price}">
                        </div>
                        <div class="mb-3">
                            <label for="author" class="form-label">T??c Gi???</label>
                            <input type="text" class="form-control" id="author" name="description"
                                   value="${stories.author}">
                        </div>
                        <div class="mb-3">
                            <label for="sub" class="form-label">Ng??y ????ng</label>
                            <input type="text" class="form-control" id="sub" name="submitted"
                                   value="${stories.submitted}">
                        </div>
                        <div class="mb-3">
                            <label for="img" class="form-label">???nh</label>
                            <input type="text" class="form-control" id="img" name="img" value="${stories.img}">
                        </div>
                        <div class="mb-3">
                            <div class="mb-3">
                                <label for="category" class="form-label">T??n Danh M???c Ph???m</label>
                                <select class="form-control" id="category" name="categoryId">
                                    <c:forEach var="category" items="${categories}">
                                        <c:choose>
                                            <c:when test="${category.id  == stories.categoryId}">
                                                <option value="${category.id}" selected>${category.name}</option>
                                            </c:when>
                                            <c:otherwise>
                                                <option value="${category.id}">${category.name}</option>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:forEach>
                                </select>
                            </div>
                            <button type="submit" class="btn btn-primary">C???p nh???t</button>
                        </div>
                    </form>
                </div>

            </div><!-- /.container-fluid -->
        </section>
        <!-- /.content -->
    </div>

</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>

</body>
</html>