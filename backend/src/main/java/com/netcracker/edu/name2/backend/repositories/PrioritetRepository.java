package com.netcracker.edu.name2.backend.repositories;


import com.netcracker.edu.name2.backend.entities.PrioritiesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrioritetRepository extends CrudRepository<PrioritiesEntity, Long>{
    List<PrioritiesEntity> findAll();
    PrioritiesEntity getRoleByIdPriority (int idPriority);
    PrioritiesEntity getRoleByName (String name);



}
