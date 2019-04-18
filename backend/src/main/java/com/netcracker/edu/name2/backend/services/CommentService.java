package com.netcracker.edu.name2.backend.services;

import com.netcracker.edu.name2.backend.entities.CommentsEntity;

import java.util.List;

public interface CommentService {
    List<CommentsEntity> findAll();
    CommentsEntity save(CommentsEntity comment);
}
