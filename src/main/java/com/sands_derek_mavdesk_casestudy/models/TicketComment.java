package com.sands_derek_mavdesk_casestudy.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class TicketComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime createdAt;

    // Getters and setters
}
