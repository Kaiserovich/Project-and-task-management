package com.netcracker.edu.name2.backend.services;

import com.netcracker.edu.name2.backend.entities.User;

public interface UserService {

    String findName(int id);
    User findById(int id);

}
