package com.sands_derek_mavdesk_casestudy.models;

import jakarta.persistence.*;

@Entity
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Getters and setters
}
