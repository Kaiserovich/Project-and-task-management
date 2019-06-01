package com.netcracker.edu.main.service;

import com.netcracker.edu.main.models.Task;

import java.util.List;

public interface TaskService {

    Task getTaskByIdTask (int idTask);
    List<Task> findAll();
    Task saveTask(Task task);
}
