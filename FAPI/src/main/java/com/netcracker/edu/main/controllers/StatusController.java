package com.netcracker.edu.main.controllers;

import com.netcracker.edu.main.models.Status;
import com.netcracker.edu.main.service.StatusService;
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
    public Iterable<Status> getAllStatus() {
        return statusService.findAll();
    }

    @RequestMapping(value = "/status/{idStatus}", method = RequestMethod.GET)
    public ResponseEntity<Status> getStatusByIdStatus(@PathVariable(name = "idStatus") int idStatus) {
        Status statusEntity = statusService.getStatusByIdStatus(idStatus);
        return ResponseEntity.ok(statusEntity);
    }
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public ResponseEntity<Status> getStatusByName(@PathVariable(name = "name") String name) {
        Status statusEntity = statusService.getStatusByName(name);
        return ResponseEntity.ok(statusEntity);
    }
}
