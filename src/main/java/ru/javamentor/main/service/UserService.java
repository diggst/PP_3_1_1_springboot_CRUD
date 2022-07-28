package ru.javamentor.main.service;

import ru.javamentor.main.models.User;
import java.util.List;

public interface UserService {

    List<User> index();

    void saveUser(User newUser);

    void deleteUser(long id);

    void updateUser(User updUser);

    User getUser(long id);
}
