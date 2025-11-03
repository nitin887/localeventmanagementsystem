package com.localeventmanagementsysytem.localeventmanagementsystem.controller;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.EventDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface.EventServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/api/events")
@RequiredArgsConstructor
public class EventController {

    private final EventServiceInterface eventService;

    @PostMapping
    public ResponseEntity<EventDto> createEvent(@RequestBody EventDto eventDto) {
        return new ResponseEntity<>(eventService.createEvent(eventDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventDto> getEventById(@PathVariable Long id) {
        return ResponseEntity.ok(eventService.getEventById(id));
    }

    @GetMapping
    public ResponseEntity<List<EventDto>> getAllEvents() {
        return ResponseEntity.ok(eventService.getAllEvents());
    }

    @PutMapping("/{id}")
    public ResponseEntity<EventDto> updateEvent(@PathVariable Long id, @RequestBody EventDto eventDto) {
        return ResponseEntity.ok(eventService.updateEvent(eventDto, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<List<EventDto>> getEventByTitle(@PathVariable String title) {
        return ResponseEntity.ok(eventService.getEventByTitle(title));
    }

    @GetMapping("/description/{description}")
    public ResponseEntity<List<EventDto>> getEventByDescription(@PathVariable String description) {
        return ResponseEntity.ok(eventService.getEventByDescription(description));
    }

    @GetMapping("/date/{date}")
    public ResponseEntity<List<EventDto>> getEventByDate(@PathVariable LocalDate date) {
        return ResponseEntity.ok(eventService.getEventByDate(date));
    }

    @GetMapping("/time/{time}")
    public ResponseEntity<List<EventDto>> getEventByTime(@PathVariable LocalTime time) {
        return ResponseEntity.ok(eventService.getEventByTime(time));
    }

    @GetMapping("/location/{location}")
    public ResponseEntity<List<EventDto>> getEventByLocation(@PathVariable String location) {
        return ResponseEntity.ok(eventService.getEventByLocation(location));
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<EventDto>> getEventByCategory(@PathVariable String category) {
        return ResponseEntity.ok(eventService.getEventByCategory(category));
    }

    @GetMapping("/organizer/{organizer}")
    public ResponseEntity<List<EventDto>> getEventByOrganizer(@PathVariable String organizer) {
        return ResponseEntity.ok(eventService.getEventByOrganizer(organizer));
    }
}
