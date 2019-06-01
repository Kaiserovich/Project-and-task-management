package com.netcracker.edu.main.service.impl;

import com.netcracker.edu.main.models.Project;
import com.netcracker.edu.main.service.ProjectService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Value("http://localhost:8082/")
    private String backendUrl;

    @Override
    public List<Project> findAll(){
        RestTemplate restTemplate = new RestTemplate();
        Project[] projectResponse = restTemplate.getForObject(backendUrl + "/api/projects", Project[].class);
        return projectResponse == null ? Collections.emptyList() : Arrays.asList(projectResponse);
    }

    @Override
    public Project getProjectByIdProject(int idProject) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendUrl + "/api/projects/project/" + idProject, Project.class);
    }
    @Override
    public Project save(Project project) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendUrl + "/api/projects", project, Project.class).getBody();
    }
}
