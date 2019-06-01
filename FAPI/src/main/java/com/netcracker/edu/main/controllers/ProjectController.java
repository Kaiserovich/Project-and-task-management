package com.netcracker.edu.main.controllers;


import com.netcracker.edu.main.models.Project;
import com.netcracker.edu.main.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    /*@RequestMapping(value = "/project/{idProject}", method = RequestMethod.GET)
    public ResponseEntity<Project> getProjectByIdProject(@PathVariable(name = "idProject") int idProject) {
        Project project = projectService.getProjectByIdProject(idProject);
        return ResponseEntity.ok(project);
    }*/
    @RequestMapping(value = "/project/{idProject}", method = RequestMethod.GET)
    public Project getProjectByIdProject(@PathVariable(name = "idProject") int idProject) {
        return projectService.getProjectByIdProject(idProject);
    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Project> getAllProjects() {
        return projectService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Project saveProject(@RequestBody Project projectsEntity) {
        return projectService.save(projectsEntity);
    }

}

