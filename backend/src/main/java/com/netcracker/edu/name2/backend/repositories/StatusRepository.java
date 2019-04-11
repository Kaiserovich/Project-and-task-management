package com.netcracker.edu.name2.backend.repositories;

import com.netcracker.edu.name2.backend.entities.StatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends CrudRepository<StatusEntity, Long>{
}
