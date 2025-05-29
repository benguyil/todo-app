package main.java.com.bengu.todo.repository;

import main.java.com.bengu.todo.model.User;
import java.util.List;


public interface TaskRepository {
    List<User> loadUsers();
    void saveUsers(List<User> users);
}
