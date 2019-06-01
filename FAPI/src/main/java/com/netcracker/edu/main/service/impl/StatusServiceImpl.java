package com.netcracker.edu.main.service.impl;

import com.netcracker.edu.main.models.Status;
import com.netcracker.edu.main.service.StatusService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {
    @Value("http://localhost:8082/")
    private String backendUrl;

    @Override
    public List<Status> findAll(){
        RestTemplate restTemplate = new RestTemplate();
        Status[] statusResponse = restTemplate.getForObject(backendUrl + "/api/status", Status[].class);
        return statusResponse == null ? Collections.emptyList() : Arrays.asList(statusResponse);
    }

    @Override
    public Status getStatusByIdStatus(int idStatus) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendUrl + "/api/status/status/" + idStatus, Status.class);
    }
    @Override
    public Status getStatusByName(String name) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendUrl + "/api/status/name/" + name, Status.class);
    }
}
