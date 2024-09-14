package com.eventmanagement.www.models;

import java.time.LocalDateTime;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;
    private String eventName;
    private String  eventDescription;
    private LocalDateTime eventDateTime;
    private String eventLocation;
    @ManyToOne
    @JoinColumn(name = "creator_id")
    private User creator;
    // Getters and setters
}
