package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    private UserDao userDao;

    public UsersServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {
      return userDao.getAll();
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }


    @Override
    public void deleteById(Long id) {
        userDao.deleteById(id);
    }

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public void change(User user) {
        userDao.change(user);
    }
}
