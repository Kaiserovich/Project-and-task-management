package com.netcracker.edu.name2.backend.controller;

import com.netcracker.edu.name2.backend.entities.ProjectsEntity;
import com.netcracker.edu.name2.backend.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/project/{idProject}", method = RequestMethod.GET)
    public ResponseEntity<ProjectsEntity> getProjectByIdProject(@PathVariable(name = "idProject") int idProject) {
        ProjectsEntity project = projectService.getProjectByIdProject(idProject);
        return ResponseEntity.ok(project);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<ProjectsEntity> getAllProjects() {
        return projectService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ProjectsEntity saveProject(@RequestBody ProjectsEntity projectsEntity) {
        return projectService.save(projectsEntity);
    }

}

