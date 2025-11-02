package com.localeventmanagementsysytem.localeventmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 1000)
    private String description;

    private String category;

    private String location;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    private Integer maxAttendees;

    @Enumerated(EnumType.STRING)
    private EventStatus status;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    private LocalDateTime createdAt;
}
