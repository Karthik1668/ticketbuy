package com.ticketbooking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @GetMapping("/")
    public String home() {
        return "Welcome to TicketBuy!";
    }
}
