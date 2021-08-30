package com.vertafore.moviebookingapp.service;

import com.vertafore.moviebookingapp.model.CinemaHalls;
import com.vertafore.moviebookingapp.model.Cities;
import com.vertafore.moviebookingapp.model.Movies;

import java.util.List;

public interface CinemaHallService {
    void addCinemaHall(CinemaHalls cinemaHall);

    void addAllCinemaHalls(List<CinemaHalls> halls);

    List<CinemaHalls> listCinemaHallsByCity(Cities city);

    List<CinemaHalls> listCinemaHallsByCityAndMovie(Cities city, Movies movie);

    List<CinemaHalls> listAll();
}
