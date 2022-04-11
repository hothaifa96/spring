package com.MovieLand.demo.Contoller;

import com.MovieLand.demo.DTO.MovieDTO;
import com.MovieLand.demo.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    @GetMapping("/movie")
    public List<MovieDTO> getAll () {
        return movieService.getAllMovies();
    }

    @PostMapping("/movie")
    public void add(@RequestBody MovieDTO movieDTO) {
        movieService.addMovie(movieDTO);
    }

}
