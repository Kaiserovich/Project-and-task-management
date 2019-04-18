package com.netcracker.edu.name2.backend.services;

import com.netcracker.edu.name2.backend.entities.ProjectsEntity;

import java.util.List;

public interface ProjectService {

    ProjectsEntity getProjectByIdProject(int idProject);
    ProjectsEntity getProjectBySummary(String summary);

    List<ProjectsEntity> findAll();
    ProjectsEntity save(ProjectsEntity project);

}
