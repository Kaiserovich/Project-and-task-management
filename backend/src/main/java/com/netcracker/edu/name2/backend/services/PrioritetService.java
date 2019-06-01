package com.netcracker.edu.name2.backend.services;

import com.netcracker.edu.name2.backend.entities.PrioritiesEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PrioritetService {
    List<PrioritiesEntity> findAll();
    PrioritiesEntity getRoleByIdPriority (int idPriority);
    PrioritiesEntity getRoleByName (String name);


}
