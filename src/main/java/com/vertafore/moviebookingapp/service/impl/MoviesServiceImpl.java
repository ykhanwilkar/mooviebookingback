package com.vertafore.moviebookingapp.service.impl;

import com.vertafore.moviebookingapp.dao.MoviesDAO;
import com.vertafore.moviebookingapp.model.CinemaHalls;
import com.vertafore.moviebookingapp.model.Cities;
import com.vertafore.moviebookingapp.model.Movies;
import com.vertafore.moviebookingapp.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesServiceImpl implements MoviesService {

    @Autowired
    private MoviesDAO moviesDAO;

    @Override
    public void addMovie(Movies movie) {
        moviesDAO.save(movie);
    }

    @Override
    public List<Movies> listMoviesByCity(Cities city) {
        return moviesDAO.listMovieByCity(city);
    }

    @Override
    public List<Movies> listMovies() {
        return moviesDAO.findAll();
    }


}
