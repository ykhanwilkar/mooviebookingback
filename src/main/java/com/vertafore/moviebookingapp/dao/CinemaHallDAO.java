package com.vertafore.moviebookingapp.dao;

import com.vertafore.moviebookingapp.model.CinemaHalls;
import com.vertafore.moviebookingapp.model.Cities;
import com.vertafore.moviebookingapp.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaHallDAO extends JpaRepository<CinemaHalls, Integer> {
    @Query("FROM CinemaHalls WHERE city=?1")
    List<CinemaHalls> listByCity(Cities city);

    @Query("FROM CinemaHalls WHERE city=?1 AND moviesList=?2")
    List<CinemaHalls> listByMovieAndCity(Cities city, Movies movie);
}
