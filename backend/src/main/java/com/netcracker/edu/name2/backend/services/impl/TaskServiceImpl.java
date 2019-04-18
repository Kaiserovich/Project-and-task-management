package com.netcracker.edu.name2.backend.services.impl;


import com.netcracker.edu.name2.backend.entities.TasksEntity;
import com.netcracker.edu.name2.backend.repositories.TaskRepository;
import com.netcracker.edu.name2.backend.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<TasksEntity> findAll() {
        return (List<TasksEntity>) taskRepository.findAll();
    }
    @Override
    public TasksEntity getTaskByIdTask(int idTask){
        return taskRepository.getTaskByIdTask(idTask);

    }

    @Override
    public TasksEntity save(TasksEntity task) {
        return taskRepository.save(task);
    }
}
