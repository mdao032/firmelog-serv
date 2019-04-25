package com.firmelog.Repositories;

import com.firmelog.Models.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository <User, String> {
    //User findBy_id(ObjectId _id);
    User findByUsername(String username);
    User findByEmail(String email);
}
