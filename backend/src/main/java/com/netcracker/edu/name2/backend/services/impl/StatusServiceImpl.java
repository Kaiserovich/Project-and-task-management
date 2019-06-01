package com.netcracker.edu.name2.backend.services.impl;

import com.netcracker.edu.name2.backend.entities.StatusEntity;
import com.netcracker.edu.name2.backend.repositories.StatusRepository;
import com.netcracker.edu.name2.backend.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {
    @Autowired
    private StatusRepository statusRepository;

    @Override
    public StatusEntity getStatusByIdStatus(int idStatus) {
        return statusRepository.getStatusByIdStatus(idStatus);
    }

    @Override
    public StatusEntity getStatusByName(String name) {
        return statusRepository.getStatusByName(name);
    }

    @Override
    public List<StatusEntity> findAll() {
        return (List<StatusEntity>) statusRepository.findAll();
    }


}
