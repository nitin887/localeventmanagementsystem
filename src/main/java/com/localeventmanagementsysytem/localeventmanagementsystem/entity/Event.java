package com.localeventmanagementsysytem.localeventmanagementsystem.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private  String  eventName;

    @Column(nullable = false)
    private String eventManagerName;

    @Column(nullable = false)
    private String eventVenue;

    @Column(nullable = false)
    private String  eventManagerEmail;

    private  Long eventManagerPhone;

    @Column(nullable = false)
    private  String eventInfo;




}
