package com.netcracker.edu.main.controllers;

import com.netcracker.edu.main.models.Prioritet;
import com.netcracker.edu.main.service.PriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/priority")
public class PriorityController {

    @Autowired
    private PriorityService priorityService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Prioritet> getAllStatus() {
        return priorityService.findAll();
    }

    @RequestMapping(value = "/priority/{idPriority}", method = RequestMethod.GET)
    public ResponseEntity<Prioritet> getRoleByIdPriority(@PathVariable(name = "idPriority") int idPriority) {
        Prioritet statusEntity = priorityService.getRoleByIdPriority(idPriority);
        return ResponseEntity.ok(statusEntity);
    }
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public ResponseEntity<Prioritet> getRoleByName(@PathVariable(name = "name") String name) {
        Prioritet statusEntity = priorityService.getRoleByName(name);
        return ResponseEntity.ok(statusEntity);
    }
}