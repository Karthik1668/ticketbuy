package com.ticketbuy;

import com.ticketbuy.controller.BookingController;

public class App {
    public static void main(String[] args) {
        System.out.println("🎟️ Welcome to TicketBuy - Book Your Movie Tickets Online!");
        BookingController controller = new BookingController();
        controller.showAvailableMovies();
    }
}
