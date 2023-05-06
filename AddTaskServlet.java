package Servlet;

import DBManager.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Task;

import java.io.IOException;

@WebServlet("/addTask")
public class AddTaskServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name= request.getParameter("name");
        String description = request.getParameter("description");
        String data = request.getParameter("data");
        Boolean complete=Boolean.parseBoolean(request.getParameter("complete"));

        Task it= new Task();
        it.setName(name);
        it.setDescription(description);
        it.setData(data);
        it.setComplete(complete);
        DBManager.addTask(it);
        response.sendRedirect("/home");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/addTask.jsp").forward(request,response);;
    }
}
