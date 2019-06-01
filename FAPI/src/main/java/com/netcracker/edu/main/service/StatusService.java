package com.netcracker.edu.main.service;

import com.netcracker.edu.main.models.Status;

import java.util.List;

public interface StatusService {
    List<Status> findAll();
    Status getStatusByIdStatus (int idStatus);
    Status getStatusByName (String name);
}
