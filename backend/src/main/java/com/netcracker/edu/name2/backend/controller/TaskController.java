package com.netcracker.edu.name2.backend.controller;

import com.netcracker.edu.name2.backend.entities.TasksEntity;
import com.netcracker.edu.name2.backend.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping(value = "/idUser/{idUser}", method = RequestMethod.GET)
    public ResponseEntity<TasksEntity> getTaskByIdTask(@PathVariable(name = "idTask") int idTask) {
        TasksEntity task = taskService.getTaskByIdTask(idTask);
        return ResponseEntity.ok(task);
    }
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<TasksEntity> getAllTasks() {
        return taskService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public TasksEntity saveTask(@RequestBody TasksEntity user) {
        return taskService.save(user);
    }
}
