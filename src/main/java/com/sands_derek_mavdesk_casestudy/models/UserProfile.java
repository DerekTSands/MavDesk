package com.sands_derek_mavdesk_casestudy.models;

import jakarta.persistence.*;

@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String profilePicture;
    private String phone;
    private String address;
    private String city;
    private String country;

    // Getters and setters
}
