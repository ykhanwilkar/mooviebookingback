package com.vertafore.moviebookingapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Movies")
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="movie_id")
    private int movieId;
    @Column(name = "movie_name")
    private String movie;
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Languages language;
    @ManyToMany
    @JoinTable(name = "movie_association", joinColumns = @JoinColumn(name = "movie_id")
    , inverseJoinColumns = @JoinColumn(name = "cinema_hall_id"))
    private List<CinemaHalls> cinemaHalls;

    public List<CinemaHalls> getCinemaHalls() {
        return cinemaHalls;
    }

    public void setCinemaHalls(List<CinemaHalls> cinemaHalls) {
        this.cinemaHalls = cinemaHalls;
    }

    public Languages getLanguage() {
        return language;
    }

    public void setLanguage(Languages language) {
        this.language = language;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

}
