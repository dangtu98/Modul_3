package controller;

import DAO.CategoryDAO.CategoryDAO;
import DAO.StoryDAO.StoryDAO;
import model.Category;
import service.CategoryService.CategoryService;
import service.CategoryService.ICategoryService;
import service.StoryService.IStoryService;
import service.StoryService.StoryService;

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
    private IStoryService storyService;

    public CategoryServlet() {
        this.categoryService = new CategoryService(new CategoryDAO());
        this.storyService = new StoryService(new StoryDAO());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "view":
                break;
            default:
                showListCategory(request, response);
                break;
        }
    }

    private void showListCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Category> categories = categoryService.findAll();
        request.setAttribute("categories", categories);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Category/list.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
