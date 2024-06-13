package com.lcwd.user.repositories;

import com.lcwd.user.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

}
