package com.example.backend.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String venue;

    private LocalDate date;

    private String guests;

    // Constructors
    public Event() {}

    public Event(String name, String venue, LocalDate date, String guests) {
        this.name = name;
        this.venue = venue;
        this.date = date;
        this.guests = guests;
    }

    // Getters and Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getVenue() { return venue; }

    public void setVenue(String venue) { this.venue = venue; }

    public LocalDate getDate() { return date; }

    public void setDate(LocalDate date) { this.date = date; }

    public String getGuests() { return guests; }

    public void setGuests(String guests) { this.guests = guests; }
}
