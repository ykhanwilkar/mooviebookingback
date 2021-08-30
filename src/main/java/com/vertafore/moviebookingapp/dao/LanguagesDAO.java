package com.vertafore.moviebookingapp.dao;

import com.vertafore.moviebookingapp.model.Languages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguagesDAO extends JpaRepository<Languages, Integer> {
}
