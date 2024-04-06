package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    List<User> getAllUsers();

    void deleteUser(Long id);

    User editUser(Long id);

    void updateUser(User user);
}
