package com.netcracker.edu.main.service.impl;

import com.netcracker.edu.main.models.Task;
import com.netcracker.edu.main.service.TaskService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class TaskServiceImlp implements TaskService {

    @Value("http://localhost:8082/")
    private String backendServerUrl;

    @Override
    public Task getTaskByIdTask(int idTask) {
        RestTemplate restTemplate = new RestTemplate();
        Task task = restTemplate.getForObject(backendServerUrl + "/api/task/idTask/" + idTask, Task.class);
        return task;
    }

    @Override
    public List<Task> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Task[] taskResponse = restTemplate.getForObject(backendServerUrl + "/api/task", Task[].class);
        return taskResponse == null ? Collections.emptyList() : Arrays.asList(taskResponse);

    }
    @Override
    public Task saveTask(Task task) {
            RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendServerUrl + "/api/task", task, Task.class).getBody();
    }
}
