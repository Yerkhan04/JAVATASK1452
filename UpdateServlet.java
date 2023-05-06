package Servlet;

import DBManager.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Task;

import java.io.IOException;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int taskId =Integer.parseInt("id");
        String name=req.getParameter("name");
        String description=req.getParameter("description");
        String data=req.getParameter("data");
        Boolean complete=Boolean.parseBoolean(req.getParameter("complete"));

        Task it2= new Task();
        it2.setId(taskId);
        it2.setName(name);
        it2.setDescription(description);
        it2.setData(data);
        it2.setComplete(complete);

        DBManager.updateTask(it2);
        resp.sendRedirect("/home");
      //  Long taskId = Long.parseLong(id);

      //  Tasks task = new Tasks(taskId,name,desc,taskDeadlineDate,Boolean.parseBoolean(status));

      //  DBManager.updateTask(taskId,task);
      //  resp.sendRedirect("/home");
    }
}
