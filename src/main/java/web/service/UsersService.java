package web.service;

import web.model.User;

import java.util.List;

public interface UsersService {

    List<User> getAll();

    void add(User user);

    void deleteById(Long id);

    User getById(Long id);

    void change(User user);
}
