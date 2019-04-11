package com.netcracker.edu.name2.backend.repositories;

import com.netcracker.edu.name2.backend.entities.UsersEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UsersEntity, Long>{
    UsersEntity getUserByPassword(String password);
    //todo загуглить почему Cannot resolve property 'EMail' less... (Ctrl+F1)
    //Inspection info: Spring Data Repository Method errors.
    //tod
    /*@Query("select password from  users where eMail = E")
    UsersEntity getUserByEMail(String E);*/

}
