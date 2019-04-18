package com.netcracker.edu.name2.backend.services;

import com.netcracker.edu.name2.backend.entities.AttachmentsEntity;

import java.util.List;

public interface AttachmetService {
    List<AttachmentsEntity> findAll();
    AttachmentsEntity save(AttachmentsEntity attachment);
}
