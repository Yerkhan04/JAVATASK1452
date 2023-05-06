package model;

import java.util.Date;

public class Task {
    int id;
    String name;
    String description;
    String data;
    boolean complete;

    public Task() {
    }

    public Task(int id, String name, String description, String data, boolean complete) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.data = data;
        this.complete = complete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}