package com.vertafore.moviebookingapp.controller;

import com.vertafore.moviebookingapp.model.Cities;
import com.vertafore.moviebookingapp.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @CrossOrigin
    @GetMapping("/list")
    public List<Cities> listCities() {
        return cityService.listCities();
    }

}
