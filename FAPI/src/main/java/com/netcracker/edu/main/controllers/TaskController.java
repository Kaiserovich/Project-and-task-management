package com.netcracker.edu.main.controllers;

import com.netcracker.edu.main.models.Task;
import com.netcracker.edu.main.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping(value="")
    public List<Task> getAllTask(){
        return taskService.findAll();
    }

    @GetMapping("/idTask/{idTask}")
    public Task getTaskByIdTask(@PathVariable int idTask) {
        return taskService.getTaskByIdTask(idTask);
    }

    @PatchMapping("")
    public Task updateTask(@RequestBody Task taskModel) {
        {
            return taskService.saveTask(taskModel);
        }

    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public Task saveTask(@RequestBody Task task){
        return taskService.saveTask(task);
    }

}
