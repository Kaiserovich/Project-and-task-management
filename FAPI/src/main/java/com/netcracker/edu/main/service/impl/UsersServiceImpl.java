package com.netcracker.edu.main.service.impl;

import com.netcracker.edu.main.models.User;
import com.netcracker.edu.main.service.UsersService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Value("http://localhost:8082/")
    private String backendUrl;


    @Override
    public User getUserByLogin(String login) {
        RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject(backendUrl + "/api/user/login/" + login, User.class);
        return user;
    }

    @Override
    public List<User> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        User[] usersResponse = restTemplate.getForObject(backendUrl + "/api/user", User[].class);
        return usersResponse == null ? Collections.emptyList() : Arrays.asList(usersResponse);

    }
    @Override
    public User saveUser(User user) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendUrl + "/api/user", user, User.class).getBody();
    }


}
