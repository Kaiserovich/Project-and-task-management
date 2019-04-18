package com.netcracker.edu.name2.backend.services;

import com.netcracker.edu.name2.backend.entities.RolesEntity;

import java.util.List;

public interface RoleService {
    List<RolesEntity> findAll();
}
