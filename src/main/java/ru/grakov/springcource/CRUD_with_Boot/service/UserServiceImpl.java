package ru.grakov.springcource.CRUD_with_Boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.grakov.springcource.CRUD_with_Boot.dao.UserDAO;
import ru.grakov.springcource.CRUD_with_Boot.models.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> index() {
        return userDAO.index();
    }

    @Override
    public User show(Integer id) {
        return userDAO.show(id);
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void update(Integer id, User updatedUser) {
        userDAO.update(id, updatedUser);
    }

    @Override
    public void delete(Integer id) {
        userDAO.delete(id);
    }
}
