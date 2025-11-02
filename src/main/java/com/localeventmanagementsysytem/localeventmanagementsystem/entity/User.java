package com.localeventmanagementsysytem.localeventmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private  String password;

    private LocalDateTime accountCreatedAt;

    private String roles;

    private Long phoneNo;








}
