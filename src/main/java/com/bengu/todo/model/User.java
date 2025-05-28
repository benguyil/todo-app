package main.java.com.bengu.todo.model;

import java.util.ArrayList;
import java.util.List;
public class User {
    private String userName;
    private List<Task> tasks;

    public User() {
    }

    public User(String userName, List<Task> tasks) {
        this.userName = userName;
        this.tasks = tasks;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    public void addTask(Task task){
        this.tasks.add(task);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
