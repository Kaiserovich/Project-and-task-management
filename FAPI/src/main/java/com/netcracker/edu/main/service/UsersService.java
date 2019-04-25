package com.netcracker.edu.main.service;


import com.netcracker.edu.main.models.User;

import java.util.List;

public interface UsersService {
    List<User> findAll();
    User getUserByLogin (String login);
    User save(User user);
}
