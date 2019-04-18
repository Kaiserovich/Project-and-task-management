package com.netcracker.edu.name2.backend.repositories;

import com.netcracker.edu.name2.backend.entities.AttachmentsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AttachmentRepository extends CrudRepository<AttachmentsEntity, Long> {

}
