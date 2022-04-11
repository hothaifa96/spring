package com.MovieLand.demo.Service;

import com.MovieLand.demo.DTO.MovieDTO;
import com.MovieLand.demo.DTO.User;
import com.MovieLand.demo.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserSer {
    @Autowired
    UserRepo userRepo;
    public List<User> getUsers(){
        List<User> movies= new ArrayList<>();
        userRepo.findAll().forEach(movies::add);
        return movies;
    }

    public User getuser(String name){
        var r =userRepo.findName(name);
        return r.get();
    }
    public void addUser (User user) {
        userRepo.insert(user);
    }

}
