package com.vertafore.moviebookingapp.controller;

import com.vertafore.moviebookingapp.model.CinemaHalls;
import com.vertafore.moviebookingapp.service.CinemaHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemahall")
public class CinemaHallController {

    @Autowired
    private CinemaHallService cinemaHallService;

    @PostMapping("/add")
    public void addCinemaHall(@RequestBody CinemaHalls hall) {
        cinemaHallService.addCinemaHall(hall);
    }

    @PostMapping("/addAll")
    public void addAllCinemaHalls(@RequestBody List<CinemaHalls> halls) {
        cinemaHallService.addAllCinemaHalls(halls);
    }

    @GetMapping("/listAll")
    public List<CinemaHalls> listALl() {
        return cinemaHallService.listAll();
    }
}
