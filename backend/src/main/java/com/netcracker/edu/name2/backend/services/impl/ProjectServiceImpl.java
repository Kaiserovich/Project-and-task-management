package com.netcracker.edu.name2.backend.services.impl;


import com.netcracker.edu.name2.backend.entities.ProjectsEntity;
import com.netcracker.edu.name2.backend.repositories.ProjectRepository;
import com.netcracker.edu.name2.backend.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<ProjectsEntity> findAll() {
        return (List<ProjectsEntity>) projectRepository.findAll();
    }

    @Override
    public ProjectsEntity getProjectByIdProject(int idProject) {
        return projectRepository.getProjectByIdProject(idProject);
    }
    @Override
    public ProjectsEntity getProjectBySummary(String summary) {
        return projectRepository.getProjectBySummary(summary);
    }

    @Override
    public ProjectsEntity save(ProjectsEntity project) {
        return projectRepository.save(project);
    }
}