package com.vertafore.moviebookingapp.dao;

import com.vertafore.moviebookingapp.model.Cities;
import com.vertafore.moviebookingapp.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviesDAO extends JpaRepository<Movies, Integer> {

    @Query("SELECT DISTINCT m FROM Movies m LEFT OUTER JOIN m.cinemaHalls ch LEFT OUTER JOIN ch.city c WHERE c=?1")
    List<Movies> listMovieByCity(Cities city);
}
