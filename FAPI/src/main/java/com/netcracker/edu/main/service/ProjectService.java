package com.netcracker.edu.main.service;

import com.netcracker.edu.main.models.Project;

import java.util.List;

public interface ProjectService {
    Project getProjectByIdProject(int idProject);
    List<Project> findAll();
    Project save(Project project);
}
