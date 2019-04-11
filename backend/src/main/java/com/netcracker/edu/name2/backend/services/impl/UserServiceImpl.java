package com.netcracker.edu.name2.backend.services.impl;

import com.netcracker.edu.name2.backend.entities.UsersEntity;
import com.netcracker.edu.name2.backend.repositories.UserRepository;
import com.netcracker.edu.name2.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UsersEntity> findAll() {
        return (List<UsersEntity>) userRepository.findAll();
    }
    @Override
    public UsersEntity getUserByPassword(String password){
        return userRepository.getUserByPassword(password);

    }



}
