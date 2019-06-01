package com.netcracker.edu.name2.backend.services;

import com.netcracker.edu.name2.backend.entities.StatusEntity;

import java.util.List;

public interface StatusService {
    List<StatusEntity> findAll();
    StatusEntity getStatusByIdStatus (int idStatus);
    StatusEntity getStatusByName (String name);


}
