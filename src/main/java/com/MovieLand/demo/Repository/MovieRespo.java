package com.MovieLand.demo.Repository;

import com.MovieLand.demo.DTO.MovieDTO;
import com.MovieLand.demo.DTO.User;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MovieRespo extends CrudRepository<MovieDTO,Integer> {

}
