package com.netcracker.edu.name2.backend.repositories;

import com.netcracker.edu.name2.backend.entities.RolesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends CrudRepository<RolesEntity, Long> {
    List<RolesEntity> findAll();
    RolesEntity getRoleByIdRole (int idRole);
    RolesEntity getRoleByName (String name);


}
