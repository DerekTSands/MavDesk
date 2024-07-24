package com.sands_derek_mavdesk_casestudy.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class TicketStatusHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    private String oldStatus;
    private String newStatus;
    private LocalDateTime changedAt;

    // Getters and setters
}
