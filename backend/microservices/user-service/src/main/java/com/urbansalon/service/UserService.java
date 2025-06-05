package com.urbansalon.service;

import com.urbansalon.modal.User;
import com.urbansalon.exception.UserException;
import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    void deleteUser(Long id) throws UserException;

    User updateUser(Long id, User user) throws UserException;
}
