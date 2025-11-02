package com.localeventmanagementsysytem.localeventmanagementsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Manager credentials")
@MappedSuperclass
public class Manager {

    @Column(nullable = false)
    private String eventManagerName;
    @Column(nullable = false)
    private String  eventManagerEmail;

    private  Long eventManagerPhone;
}
