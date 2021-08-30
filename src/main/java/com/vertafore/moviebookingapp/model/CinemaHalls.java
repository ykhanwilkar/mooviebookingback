package com.vertafore.moviebookingapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Cinema_halls")
public class CinemaHalls {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name ="cinema_hall_id")
    private Integer cinemaHallId;
    @Column(name = "hall_name")
    private String cinemaHall;
    @Column(name ="hall_addr")
    private String address;
    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private Cities city;
    @ManyToMany @JsonIgnore
    @JoinTable(name = "movie_association", joinColumns = @JoinColumn(name = "cinema_hall_id")
            , inverseJoinColumns = @JoinColumn(name = "movie_id"))
    private List<Movies> moviesList;

    public List<Movies> getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(List<Movies> moviesList) {
        this.moviesList = moviesList;
    }

    public Integer getCinemaHallId() {
        return cinemaHallId;
    }

    public void setCinemaHallId(Integer cinemaHallId) {
        this.cinemaHallId = cinemaHallId;
    }

    public String getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(String cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cities getCity() {
        return city;
    }

    public void setCity(Cities city) {
        this.city = city;
    }
}
