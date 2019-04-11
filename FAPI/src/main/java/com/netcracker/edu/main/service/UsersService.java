package com.netcracker.edu.main.service;


import java.util.List;

public interface UsersService {
    List<UsersEntity> findAll();
    UsersEntity findByEmail (String eMail);
}
