package com.netcracker.edu.name2.backend.controller;


import com.netcracker.edu.name2.backend.entities.PrioritiesEntity;
import com.netcracker.edu.name2.backend.services.PrioritetService;
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
    private PrioritetService prioritetService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<PrioritiesEntity> getAllStatus() {
        return prioritetService.findAll();
    }

    @RequestMapping(value = "/priority/{idPriority}", method = RequestMethod.GET)
    public ResponseEntity<PrioritiesEntity> getRoleByIdPriority(@PathVariable(name = "idPriority") int idPriority) {
        PrioritiesEntity statusEntity = prioritetService.getRoleByIdPriority(idPriority);
        return ResponseEntity.ok(statusEntity);
    }
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public ResponseEntity<PrioritiesEntity> getRoleByName(@PathVariable(name = "name") String name) {
        PrioritiesEntity statusEntity = prioritetService.getRoleByName(name);
        return ResponseEntity.ok(statusEntity);
    }

}