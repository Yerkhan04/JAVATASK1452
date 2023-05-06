package Servlet;

import DBManager.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Task;

import java.io.IOException;

@WebServlet("/details")
public class DetailsServlet  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Boolean complete=Boolean.parseBoolean(request.getParameter("select"));
        Task it= new Task();

        if(request.getParameter("select")=="Да"){
            it.setComplete(true);
            response.sendRedirect("/home");
        }else {
            it.setComplete(false);
            response.sendRedirect("/home");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Task task=DBManager.getTask(id);
        if(task!=null){
            request.setAttribute("task",task);
            request.getRequestDispatcher("/details.jsp").forward(request,response);

        }else {
            request.getRequestDispatcher("/404.jsp").forward(request,response);
        }

    }
}
