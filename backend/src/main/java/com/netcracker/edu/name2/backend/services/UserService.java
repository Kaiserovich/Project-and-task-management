package com.netcracker.edu.name2.backend.services;

import com.netcracker.edu.name2.backend.entities.UsersEntity;

import java.util.List;

public interface UserService {
    List<UsersEntity> findAll();
    UsersEntity getUserByIdUsers(int idUser);
    UsersEntity getUserByLogin (String login);

    UsersEntity save(UsersEntity user);

}
