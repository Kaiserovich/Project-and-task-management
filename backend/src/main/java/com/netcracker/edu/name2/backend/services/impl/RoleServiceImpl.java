package com.netcracker.edu.name2.backend.services.impl;

import com.netcracker.edu.name2.backend.entities.RolesEntity;
import com.netcracker.edu.name2.backend.repositories.RoleRepository;
import com.netcracker.edu.name2.backend.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public RolesEntity getRoleByIdRole(int idStatus) {
        return roleRepository.getRoleByIdRole(idStatus);
    }

    @Override
    public RolesEntity getRoleByName(String name) {
        return roleRepository.getRoleByName(name);
    }

    @Override
    public List<RolesEntity> findAll() {
        return (List<RolesEntity>) roleRepository.findAll();
    }

}
