package com.netcracker.edu.name2.backend.services;

import com.netcracker.edu.name2.backend.entities.TasksEntity;

import java.util.List;

public interface TaskService {
    TasksEntity getTaskByIdTask (int idTask);

    List<TasksEntity> findAll();
    TasksEntity save(TasksEntity task);
}
