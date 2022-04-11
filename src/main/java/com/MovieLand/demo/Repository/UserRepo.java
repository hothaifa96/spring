package com.MovieLand.demo.Repository;

import com.MovieLand.demo.DTO.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserRepo extends MongoRepository<User,String> {
    @Query("{'name':?0}")
    Optional<User> findName(String name);
}
