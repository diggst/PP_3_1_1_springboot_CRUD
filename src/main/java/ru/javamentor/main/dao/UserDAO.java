package ru.javamentor.main.dao;

import ru.javamentor.main.models.User;

import java.util.List;

public interface UserDAO {
    public List<User> index();

    public void saveUser(User newUser);

    public void deleteUser(long id);

    public void updateUser(User updUser);

    public User getUser(long id);
}
