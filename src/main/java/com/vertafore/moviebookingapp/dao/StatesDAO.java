package com.vertafore.moviebookingapp.dao;

import com.vertafore.moviebookingapp.model.States;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatesDAO extends JpaRepository<States, Integer> {
}
