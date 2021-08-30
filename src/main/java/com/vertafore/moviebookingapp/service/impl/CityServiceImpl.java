package com.vertafore.moviebookingapp.service.impl;

import com.vertafore.moviebookingapp.dao.CitiesDAO;
import com.vertafore.moviebookingapp.model.Cities;
import com.vertafore.moviebookingapp.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CitiesDAO citiesDAO;

    @Override
    public List<Cities> listCities() {
        return citiesDAO.findAll();
    }

    @Override
    public void addCity(Cities city) {
        citiesDAO.save(city);
    }
}
