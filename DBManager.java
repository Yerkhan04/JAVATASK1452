package DBManager;

import jakarta.servlet.http.HttpServlet;
import model.Task;

import java.util.ArrayList;

public class DBManager extends HttpServlet {
    public static ArrayList<Task> tasks = new ArrayList<>();
    public static int id;

    static {

    }

    public static void addTask(Task task) {
        task.setId(id);
        tasks.add(task);
        id++;
    }

    public static ArrayList<Task> getTasks() {
        return tasks;
    }

    public static Task getTask(int id) {
        for (Task it : tasks) {
            if (it.getId() == id) {
                return it;
            }
        } return null;
    }
    public static void deleteTask(int id){
        for (int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).getId()==id){
                tasks.remove(i);
            }
        }
    }
    public static Task updateTask(Task task){
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId()==id){
                tasks.set(i,task);
            }
        }
        return null;
    }
}
