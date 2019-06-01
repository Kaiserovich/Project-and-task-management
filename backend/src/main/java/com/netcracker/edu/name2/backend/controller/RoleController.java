package com.netcracker.edu.name2.backend.controller;

import com.netcracker.edu.name2.backend.entities.RolesEntity;
import com.netcracker.edu.name2.backend.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<RolesEntity> getAllStatus() {
        return roleService.findAll();
    }

    @RequestMapping(value = "/role/{idRole}", method = RequestMethod.GET)
    public ResponseEntity<RolesEntity> getRoleByIdRole(@PathVariable(name = "idRole") int idRole) {
        RolesEntity statusEntity = roleService.getRoleByIdRole(idRole);
        return ResponseEntity.ok(statusEntity);
    }
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public ResponseEntity<RolesEntity> getRoleByName(@PathVariable(name = "name") String name) {
        RolesEntity statusEntity = roleService.getRoleByName(name);
        return ResponseEntity.ok(statusEntity);
    }

}
