package com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.EventDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.entity.EventStatus;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface EventServiceInterface {
    EventDto createEvent(EventDto eventDto);
    EventDto updateEvent(Long id, EventDto eventDto);
    void deleteEvent(Long id);
    EventDto getEventById(Long id);
    List<EventDto> getAllEvents();
    List<EventDto> getEventByTitle(String title);
    List<EventDto> getEventByDescription(String description);
    List<EventDto> getEventByDate(LocalDate date);
    List<EventDto> getEventByTime(LocalTime time);
    List<EventDto> getEventByLocation(String location);
    List<EventDto> getEventByCategory(String category);
    List<EventDto> getEventByOrganizer(String organizer);
    List<EventDto> getEventsByStatus(EventStatus status);
}
