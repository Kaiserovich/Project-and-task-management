package com.netcracker.edu.name2.backend.services.impl;


import com.netcracker.edu.name2.backend.entities.PrioritiesEntity;
import com.netcracker.edu.name2.backend.repositories.PrioritetRepository;
import com.netcracker.edu.name2.backend.services.PrioritetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProritetServiceImpl  implements PrioritetService {

    @Autowired
    private PrioritetRepository prioritetRepository;
    @Override
    public PrioritiesEntity getRoleByIdPriority(int idPriority) {
        return prioritetRepository.getRoleByIdPriority(idPriority);
    }

    @Override
    public PrioritiesEntity getRoleByName(String name) {
        return prioritetRepository.getRoleByName(name);
    }

    @Override
    public List<PrioritiesEntity> findAll() {
        return (List<PrioritiesEntity>) prioritetRepository.findAll();
    }
}
