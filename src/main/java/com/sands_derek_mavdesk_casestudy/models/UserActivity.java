package com.sands_derek_mavdesk_casestudy.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class UserActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String activity;
    private LocalDateTime activityTime;

    // Getters and setters
}
