package controller;

import DAO.CategoryDAO.CategoryDAO;
import DAO.ProductDAO.ProductDAO;
import model.Category;
import model.Product;
import service.CategoryService.CategoryService;
import service.CategoryService.ICategoryService;
import service.ProductService.IProductService;
import service.ProductService.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CategoryServlet", urlPatterns = "/categories")
public class CategoryServlet extends HttpServlet {
    private ICategoryService categoryService;
    private IProductService productService;


    public CategoryServlet() {
        this.categoryService = new CategoryService(new CategoryDAO());
        this.productService = new ProductService(new ProductDAO());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String action = request.getParameter("action");
       if (action == null){
           action = "";
       }
       switch (action){
           case "delete":
               showDeleteCategory(request, response);
               break;
           case "view":
               showListProductByCategory(request, response);
           default:
               showListCategory(request, response);
               break;
       }
    }

    private void showDeleteCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Category category = categoryService.findById(id);
        request.setAttribute("category",category);
        RequestDispatcher dispatcher = request.getRequestDispatcher("category/delete.jsp");
        dispatcher.forward(request, response);
    }

    private void showListProductByCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int categoryId = Integer.parseInt(request.getParameter("id"));
        List<Product> products = productService.findAllProductByCategoryId(categoryId);
        request.setAttribute("products", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/category/view.jsp");
        dispatcher.forward(request, response);
    }

    private void showListCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Category> categories = categoryService.findAll();
        request.setAttribute("categories",categories);
        RequestDispatcher dispatcher = request.getRequestDispatcher("category/list.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           String action = request.getParameter("action");
           if (action == null){
               action = "";
           }
           switch (action){
               case "delete":
                   deleteCategory(request, response);
                   break;
           }
    }

    private void deleteCategory(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        categoryService.deleteById(id);
        response.sendRedirect("categories");
    }
}
