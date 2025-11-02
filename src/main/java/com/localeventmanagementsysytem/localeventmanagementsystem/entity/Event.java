package com.localeventmanagementsysytem.localeventmanagementsystem.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "Event")
public class Event extends Manager{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private  String  eventName;



    @Column(nullable = false)
    private String eventVenue;



    @Column(nullable = false)
    private  String eventInfo;




}
