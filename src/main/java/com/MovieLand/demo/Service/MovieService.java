package com.MovieLand.demo.Service;


import com.MovieLand.demo.DTO.MovieDTO;
import com.MovieLand.demo.Repository.MovieRespo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    MovieRespo movieRespo;

    public List<MovieDTO> getAllMovies(){
        List<MovieDTO> movies= new ArrayList<>();
        movieRespo.findAll().forEach(movies::add);
        return movies;
    }

    public MovieDTO getMovie(int id){
         var r =movieRespo.findById(id);
         return r.get();
    }
    public void addMovie(MovieDTO movie) {
       movieRespo.save(movie);
    }

}
