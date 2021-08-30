package com.vertafore.moviebookingapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Cities")
public class Cities {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "city_id")
    private Integer cityId;
    @Column(name = "city")
    private String city;
    @JsonIgnore
    @OneToMany(mappedBy = "city")
    private List<CinemaHalls> cinemaHalls;

    public List<CinemaHalls> getCinemaHalls() {return cinemaHalls;}

    public void setCinemaHalls(List<CinemaHalls> cinemaHalls) {this.cinemaHalls = cinemaHalls;}

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
