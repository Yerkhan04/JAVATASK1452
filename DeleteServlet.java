package Servlet;

import DBManager.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int taskId=Integer.parseInt(null);
        try{
            taskId=id;
    }catch (Exception e){
            e.printStackTrace();

        }

        DBManager.deleteTask(taskId);
        response.sendRedirect("/delete");

        }
}
