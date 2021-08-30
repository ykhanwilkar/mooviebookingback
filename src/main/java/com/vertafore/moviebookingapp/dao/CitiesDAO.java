package com.vertafore.moviebookingapp.dao;

import com.vertafore.moviebookingapp.model.Cities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitiesDAO extends JpaRepository<Cities, Integer> {
}
