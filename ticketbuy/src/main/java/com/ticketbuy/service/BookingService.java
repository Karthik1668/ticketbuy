package com.ticketbuy.service;

import com.ticketbuy.model.Movie;
import java.util.ArrayList;
import java.util.List;

public class BookingService {

    public List<Movie> getAvailableMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Pushpa 2", "Telugu"));
        movies.add(new Movie("Leo", "Tamil"));
        return movies;
    }
}
