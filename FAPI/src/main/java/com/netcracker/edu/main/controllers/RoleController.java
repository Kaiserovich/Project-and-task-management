package com.netcracker.edu.main.controllers;


import com.netcracker.edu.main.models.Role;
import com.netcracker.edu.main.service.RoleService;
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
    public Iterable<Role> getAllStatus() {
        return roleService.findAll();
    }

    @RequestMapping(value = "/role/{idRole}", method = RequestMethod.GET)
    public ResponseEntity<Role> getRoleByIdRole(@PathVariable(name = "idRole") int idRole) {
        Role statusEntity = roleService.getRoleByIdRole(idRole);
        return ResponseEntity.ok(statusEntity);
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public ResponseEntity<Role> getRoleByName(@PathVariable(name = "name") String name) {
        Role statusEntity = roleService.getRoleByName(name);
        return ResponseEntity.ok(statusEntity);
    }
}
