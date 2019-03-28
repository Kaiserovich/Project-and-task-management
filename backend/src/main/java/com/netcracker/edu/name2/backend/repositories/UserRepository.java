package com.netcracker.edu.name2.backend.repositories;

import com.netcracker.edu.name2.backend.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findById(int id);
}
