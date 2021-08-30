package com.vertafore.moviebookingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = {"com.vertafore.moviebookingapp"})
public class MoviebookingappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoviebookingappApplication.class, args);
    }

}
