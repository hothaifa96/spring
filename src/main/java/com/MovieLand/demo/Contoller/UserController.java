package com.MovieLand.demo.Contoller;

import com.MovieLand.demo.DTO.MovieDTO;
import com.MovieLand.demo.DTO.User;
import com.MovieLand.demo.Service.MovieService;
import com.MovieLand.demo.Service.UserSer;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mongo")
public class UserController {
    @Autowired
    UserSer userser;

    @GetMapping
    public List<User> getAll () {
        return userser.getUsers();
    }
    @GetMapping("/{name}")
    public User get (@PathVariable String name ) {
        return userser.getuser(name);
    }

    @PostMapping()
    public void add(@RequestBody User user) {
        userser.addUser(user);
    }


}
