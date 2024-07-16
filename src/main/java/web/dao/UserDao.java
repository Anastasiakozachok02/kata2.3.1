package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAll();

    void add(User user);

    void deleteById(Long id);

    User getById(Long id);

    void change(User user);
}
