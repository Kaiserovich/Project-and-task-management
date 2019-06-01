package com.netcracker.edu.name2.backend.repositories;

import com.netcracker.edu.name2.backend.entities.TasksEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends CrudRepository<TasksEntity, Long>{
    TasksEntity getTaskByIdTask (int idTask);
    List<TasksEntity> findAll();
}
