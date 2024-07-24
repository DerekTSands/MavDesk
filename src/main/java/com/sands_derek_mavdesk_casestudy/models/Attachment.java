package com.sands_derek_mavdesk_casestudy.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    private String filePath;
    private LocalDateTime uploadedAt;

    // Getters and setters
}
