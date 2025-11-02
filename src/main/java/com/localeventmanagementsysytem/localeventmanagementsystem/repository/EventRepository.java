package com.localeventmanagementsysytem.localeventmanagementsystem.repository;

import com.localeventmanagementsysytem.localeventmanagementsystem.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    Optional<Event> findById(Long id);
    Optional<Event> findByTitle(String title);
    Optional<Event> findByCategory(String category);
    Optional<Event> findByLocation(String location);
    Optional<Event> findByStatus(String status);
    Optional<Event> findByStartTime(String startTime);
    Optional<Event> findByEndTime(String endTime);
    Optional<Event> findByMaxAttendees(Integer maxAttendees);
    Optional<Event> findByCreatedAt(String createdAt);
}
