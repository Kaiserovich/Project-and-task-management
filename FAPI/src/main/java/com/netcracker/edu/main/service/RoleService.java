package com.netcracker.edu.main.service;

import com.netcracker.edu.main.models.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();
    Role getRoleByIdRole (int idRole);
    Role getRoleByName (String name);
}
