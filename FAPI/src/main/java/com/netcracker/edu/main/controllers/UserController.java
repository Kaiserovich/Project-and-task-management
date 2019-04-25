package com.netcracker.edu.main.controllers;

import com.netcracker.edu.main.models.User;
import com.netcracker.edu.main.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UsersService usersService;

    //@PreAuthorize("hasRole('ADMIN')")
    @GetMapping(value="")
    public List<User> getAllUsers(){
        return usersService.findAll();
    }

    @GetMapping("/login/{login}")
    public User getUserByLogin(@PathVariable String login) {
        return usersService.getUserByLogin(login);
    }

    @RequestMapping(value="/signup", method = RequestMethod.POST, produces = "application/json")
    public User saveUser(@RequestBody User user){
        return usersService.save(user);
    }

}
