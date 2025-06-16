package com.ticketbuy.controller;

import com.ticketbuy.service.BookingService;
import com.ticketbuy.model.Movie;

public class BookingController {

    private BookingService bookingService = new BookingService();

    public void showAvailableMovies() {
        System.out.println("📽️ Now Showing:");
        for (Movie movie : bookingService.getAvailableMovies()) {
            System.out.println("🎬 " + movie.getTitle() + " (" + movie.getLanguage() + ")");
        }
    }
}
