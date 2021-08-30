package com.vertafore.moviebookingapp.service.impl;

import com.vertafore.moviebookingapp.dao.CinemaHallDAO;
import com.vertafore.moviebookingapp.model.CinemaHalls;
import com.vertafore.moviebookingapp.model.Cities;
import com.vertafore.moviebookingapp.model.Movies;
import com.vertafore.moviebookingapp.service.CinemaHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaHallServiceImpl implements CinemaHallService {

    @Autowired
    private CinemaHallDAO cinemaHallDAO;

    @Override
    public void addCinemaHall(CinemaHalls cinemaHall) {
        cinemaHallDAO.save(cinemaHall);
    }

    @Override
    public void addAllCinemaHalls(List<CinemaHalls> halls) {
        cinemaHallDAO.saveAll(halls);
    }

    @Override
    public List<CinemaHalls> listCinemaHallsByCity(Cities city) {
        return cinemaHallDAO.listByCity(city);
    }

    @Override
    public List<CinemaHalls> listCinemaHallsByCityAndMovie(Cities city, Movies movie) {
        return cinemaHallDAO.listByMovieAndCity(city, movie);
    }

    @Override
    public List<CinemaHalls> listAll() {
        return cinemaHallDAO.findAll();
    }
}
