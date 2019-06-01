package com.netcracker.edu.main.service;


import com.netcracker.edu.main.models.Prioritet;

import java.util.List;

public interface PriorityService{
    List<Prioritet> findAll();
    Prioritet getRoleByIdPriority (int idPriority);
    Prioritet getRoleByName (String name);
}
