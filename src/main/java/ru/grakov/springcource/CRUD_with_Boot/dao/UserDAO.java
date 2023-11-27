package ru.grakov.springcource.CRUD_with_Boot.dao;


import ru.grakov.springcource.CRUD_with_Boot.models.User;

import java.util.List;

public interface UserDAO {
    List<User> index();
    User show(Integer id);
    void save(User user);
    void update(Integer id, User updatedUser);
    void delete(Integer id);
}