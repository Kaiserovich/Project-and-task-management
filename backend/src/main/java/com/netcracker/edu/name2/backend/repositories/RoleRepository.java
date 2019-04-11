package com.netcracker.edu.name2.backend.repositories;

import com.netcracker.edu.name2.backend.entities.RolesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<RolesEntity, Long> {
}
