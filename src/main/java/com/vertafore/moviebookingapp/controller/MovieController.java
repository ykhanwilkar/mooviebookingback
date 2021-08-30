package com.vertafore.moviebookingapp.controller;

import com.vertafore.moviebookingapp.model.Cities;
import com.vertafore.moviebookingapp.model.Movies;
import com.vertafore.moviebookingapp.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MoviesService movieService;

    @PostMapping("/add")
    public void addMovie(@RequestBody Movies movie) {
        movieService.addMovie(movie);
    }

    @PostMapping("/list")
    public List<Movies> listMovies(@RequestBody Cities city) {
        return movieService.listMoviesByCity(city);
    }

    @GetMapping("/listAll")
    public Set<Movies> listAllMovies() {
        return new HashSet<Movies>(movieService.listMovies());
    }



}
