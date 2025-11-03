package com.localeventmanagementsysytem.localeventmanagementsystem.repository;

import com.localeventmanagementsysytem.localeventmanagementsystem.entity.Event;
import com.localeventmanagementsysytem.localeventmanagementsystem.entity.EventStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByCategory(String category);
    List<Event> findByStatus(EventStatus status);
    List<Event> findByTitleContaining(String title);
    List<Event> findByDescriptionContaining(String description);
    List<Event> findByLocation(String location);
    List<Event> findByCreatedBy_Username(String username);
    List<Event> findByStartTimeBetween(LocalDateTime start, LocalDateTime end);
}
