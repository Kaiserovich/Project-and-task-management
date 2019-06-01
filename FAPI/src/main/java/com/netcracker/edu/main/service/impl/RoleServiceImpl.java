package com.netcracker.edu.main.service.impl;

import com.netcracker.edu.main.models.Role;
import com.netcracker.edu.main.service.RoleService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Value("http://localhost:8082/")
    private String backendUrl;

    @Override
    public List<Role> findAll(){
        RestTemplate restTemplate = new RestTemplate();
        Role[] roleResponse = restTemplate.getForObject(backendUrl + "/api/role", Role[].class);
        return roleResponse == null ? Collections.emptyList() : Arrays.asList(roleResponse);
    }

    @Override
    public Role getRoleByIdRole(int idRole) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendUrl + "/api/role/role/" + idRole, Role.class);
    }

    @Override
    public Role getRoleByName(String name) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendUrl + "/api/role/name/" + name, Role.class);
    }
}
