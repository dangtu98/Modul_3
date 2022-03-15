package controller;

import DAO.CategoryDAO.CategoryDAO;
import DAO.StoryDAO.StoryDAO;
import model.Category;
import model.Story;
import service.CategoryService.CategoryService;
import service.CategoryService.ICategoryService;
import service.StoryService.IStoryService;
import service.StoryService.StoryService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet(name = "StoryServlet", value = "/stories")
public class StoryServlet extends HttpServlet {
    private IStoryService storyService;
    private ICategoryService categoryService;

    public StoryServlet() {
        this.storyService = new StoryService(new StoryDAO());
        this.categoryService = new CategoryService(new CategoryDAO());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateStory(request, response);
                break;
            case "edit":
                showEditStory(request, response);
                break;
            default:
                showListStory(request, response);
                break;
        }
    }

    private void showEditStory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Category> categories = categoryService.findAll();
        int id = Integer.parseInt(request.getParameter("id"));
        Story stories = storyService.findById(id);
        request.setAttribute("categories",categories);
        request.setAttribute("stories", stories);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Story/edit.jsp");
        dispatcher.forward(request, response);
    }

    private void showCreateStory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Category> categories = categoryService.findAll();
        request.setAttribute("categories", categories);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Story/create.jsp");
        dispatcher.forward(request, response);
    }

    private void showListStory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Story> stories = storyService.findAll();
        request.setAttribute("stories", stories);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Story/list.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createStory(request, response);
                break;

        }


    }

    private void createStory(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String author = request.getParameter("author");
        String sub = request.getParameter("submitted");
        String img = request.getParameter("img");
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        Story story = new Story(categoryId, name, price, author, sub, img);
        storyService.create(story);
        response.sendRedirect("stories");
    }
}
