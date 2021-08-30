package com.vertafore.moviebookingapp.service;

import com.vertafore.moviebookingapp.model.Cities;

import java.util.List;

public interface CityService {
    public List<Cities> listCities();

    public void addCity(Cities city);
}
