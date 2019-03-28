package com.netcracker.edu.name2.backend.services.impl;

import com.netcracker.edu.name2.backend.entities.User;
import com.netcracker.edu.name2.backend.repositories.UserRepository;
import com.netcracker.edu.name2.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserRepository userRepository;

    public String findName(int id) {

        return null;
    }

    public User findById(int id) {

        return userRepository.findById(id);
    }
}
