package com.netcracker.edu.name2.backend.controller;

import com.netcracker.edu.name2.backend.entities.StatusEntity;
import com.netcracker.edu.name2.backend.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<StatusEntity> getAllStatus() {
        return statusService.findAll();
    }

    @RequestMapping(value = "/status/{idStatus}", method = RequestMethod.GET)
    public ResponseEntity<StatusEntity> getStatusByIdStatus(@PathVariable(name = "idStatus") int idStatus) {
        StatusEntity statusEntity = statusService.getStatusByIdStatus(idStatus);
        return ResponseEntity.ok(statusEntity);
    }
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public ResponseEntity<StatusEntity> getStatusByName(@PathVariable(name = "name") String name) {
        StatusEntity statusEntity = statusService.getStatusByName(name);
        return ResponseEntity.ok(statusEntity);
    }
}
