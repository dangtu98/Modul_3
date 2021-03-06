package controller;

import model.City;
import service.CityService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CityServlet", urlPatterns = "/cities")
public class CityServlet extends HttpServlet {
    private final CityService cityService = new CityService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        action(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        action(request, response);
    }

    private void action(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "all";
        }
        switch (action) {
            case "createGet":
                createGet(request, response);
                break;
            case "createPost":
                createPost(request, response);
                break;
            case "editGet":
                editGet(request, response);
                break;
            case "editPost":
                editPost(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            case "detail":
                displayDetail(request, response);
                break;
            case "all":
                displayAll(request, response);
                break;
        }

    }

    private void displayAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<City> cities = cityService.getCities();
        request.setAttribute("listcity", cities);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view.jsp");
        requestDispatcher.forward(request, response);
    }

    private void displayDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        City city = cityService.getCity(id);
        request.setAttribute("city", city);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view-detail.jsp");
        requestDispatcher.forward(request, response);
    }

    private void createGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("create.jsp");
    }

    private void createPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double popular = Double.parseDouble(request.getParameter("popular"));
        double area = Double.parseDouble(request.getParameter("area"));
        double GDP = Double.parseDouble(request.getParameter("GDP"));
        String country = request.getParameter("country");
        cityService.createCity(new City(id, name, popular, area, GDP, country));
        ArrayList<City> cities = cityService.getCities();
        request.setAttribute("listcity", cities);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view.jsp");
        requestDispatcher.forward(request, response);
    }

    private void editGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        City city = cityService.getCity(id);
        request.setAttribute("city", city);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("edit.jsp");
        requestDispatcher.forward(request, response);
    }

    private void editPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<City> cities = cityService.getCities();
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double popular = Double.parseDouble(request.getParameter("popular"));
        double area = Double.parseDouble(request.getParameter("area"));
        double GDP = Double.parseDouble(request.getParameter("GDP"));
        String country = request.getParameter("country");
        City city = cityService.getCity(id);
        int index = -1;
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getId() == id) {
                index = i;
            }
        }
        cityService.editCity(new City(id, name, popular, area, GDP, country), index);
        cities = cityService.getCities();
        request.setAttribute("listcity", cities);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view.jsp");
        requestDispatcher.forward(request, response);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<City> cities = cityService.getCities();
        int id = Integer.parseInt(request.getParameter("id"));
        City city = cityService.getCity(id);
        cityService.deleteCity(city);
        request.setAttribute("listcity", cities);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view.jsp");
        requestDispatcher.forward(request, response);
    }


}
