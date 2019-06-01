package com.netcracker.edu.name2.backend.controller;

import com.netcracker.edu.name2.backend.entities.UsersEntity;
import com.netcracker.edu.name2.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

   @RequestMapping(value = "/idUser/{idUser}", method = RequestMethod.GET)
    public ResponseEntity<UsersEntity> getUserByIdUsers(@PathVariable(name = "idUser") int idUser) {
        UsersEntity user = userService.getUserByIdUsers(idUser);
        return ResponseEntity.ok(user);
    }


    @RequestMapping(value = "/login/{login}", method = RequestMethod.GET)
    public ResponseEntity<UsersEntity> getUserByLogin(@PathVariable(name = "login") String login) {
        UsersEntity user = userService.getUserByLogin(login);
        return ResponseEntity.ok(user);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<UsersEntity> getAllUsers() {
        return userService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public UsersEntity saveNewUser(@RequestBody UsersEntity user) {
        return userService.save(user);
    }

}
