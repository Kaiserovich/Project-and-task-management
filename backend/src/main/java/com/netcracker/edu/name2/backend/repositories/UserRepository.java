package com.netcracker.edu.name2.backend.repositories;

import com.netcracker.edu.name2.backend.entities.UsersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends CrudRepository<UsersEntity, Long>{
    UsersEntity getUserByIdUsers(int idUser);
    UsersEntity getUserByLogin(String login);

}
