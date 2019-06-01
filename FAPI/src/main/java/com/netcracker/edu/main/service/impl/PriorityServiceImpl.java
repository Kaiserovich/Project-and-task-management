package com.netcracker.edu.main.service.impl;

import com.netcracker.edu.main.models.Prioritet;
import com.netcracker.edu.main.service.PriorityService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class PriorityServiceImpl implements PriorityService {
    @Value("http://localhost:8082/")
    private String backendUrl;

    @Override
    public List<Prioritet> findAll(){
        RestTemplate restTemplate = new RestTemplate();
        Prioritet[] priorityResponse = restTemplate.getForObject(backendUrl + "/api/priority", Prioritet[].class);
        return priorityResponse == null ? Collections.emptyList() : Arrays.asList(priorityResponse);
    }

    @Override
    public Prioritet getRoleByIdPriority(int idPriority) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendUrl + "/api/priority/priority/" + idPriority, Prioritet.class);
    }
    @Override
    public Prioritet getRoleByName(String name) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendUrl + "/api/priority/name/" + name, Prioritet.class);
    }
}
