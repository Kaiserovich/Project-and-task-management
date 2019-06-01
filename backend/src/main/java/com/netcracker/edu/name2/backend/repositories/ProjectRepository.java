package com.netcracker.edu.name2.backend.repositories;

import com.netcracker.edu.name2.backend.entities.ProjectsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<ProjectsEntity, Long> {
    ProjectsEntity getProjectByIdProject(int idProject);
}
