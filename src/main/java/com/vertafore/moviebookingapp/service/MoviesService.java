package com.vertafore.moviebookingapp.service;

import com.vertafore.moviebookingapp.model.CinemaHalls;
import com.vertafore.moviebookingapp.model.Cities;
import com.vertafore.moviebookingapp.model.Movies;

import java.util.List;

public interface MoviesService {
    public void addMovie(Movies movie);

    public List<Movies> listMoviesByCity(Cities city);

    public List<Movies> listMovies();
}
