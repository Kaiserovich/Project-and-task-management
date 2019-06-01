package com.netcracker.edu.name2.backend.controller;

import com.netcracker.edu.name2.backend.entities.TasksEntity;
import com.netcracker.edu.name2.backend.repositories.TaskRepository;
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

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value = "/idTask/{idTask}", method = RequestMethod.GET)
    public ResponseEntity<TasksEntity> getTaskByIdTask(@PathVariable(name = "idTask") int idTask) {
        TasksEntity task = taskService.getTaskByIdTask(idTask);
        return ResponseEntity.ok(task);
    }
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<TasksEntity> getAllTasks() {

        List<TasksEntity>  data= taskService.findAll();
        return data;
    }

    @PatchMapping("")
    public ResponseEntity<TasksEntity> updateTask(@RequestBody TasksEntity task) {
        TasksEntity updatedTask = taskRepository.getTaskByIdTask(task.getIdTask());
        updatedTask.setIdStatus(task.getIdStatus());
        updatedTask.setIdPriority(task.getIdPriority());
        updatedTask.setUpdatedDate(task.getUpdatedDate());
        updatedTask.setDescription(task.getDescription());
        updatedTask.setDueDate(task.getDueDate());
        updatedTask.setResolvedDate(task.getResolvedDate());
        updatedTask.setClosedDate(task.getClosedDate());
        updatedTask.setEstimation(task.getEstimation());
        updatedTask.setAssignee(task.getAssignee());
        updatedTask.setReporter(task.getReporter());
        TasksEntity taskResult = taskService.save(updatedTask);

        if (taskResult == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(taskResult);
    }

        @RequestMapping(method = RequestMethod.POST)
    public TasksEntity saveTask(@RequestBody TasksEntity task) {
        return taskService.save(task);
    }
}
