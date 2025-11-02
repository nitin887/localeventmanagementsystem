package com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.EventDto;

import java.util.List;

public interface EventServiceInterface {
    //create event
    EventDto createEvent(EventDto eventDto);
    //update event by id
    EventDto updateEvent(EventDto eventDto, Long id);
    //delete event by id
    EventDto deleteEvent(Long id);
    //get event by id
    List<EventDto> getEventById(Long id);
    //get all events
    List<EventDto> getAllEvents();
    //get event by name
    List<EventDto> getEventByName(String name);

    //get event by date
    List<EventDto> getEventByDate(String date);
    //get event by time
    List<EventDto> getEventByTime(String time);
    //get event by location
    List<EventDto> getEventByLocation(String location);
    //get event by category
    List<EventDto> getEventByCategory(String category);
    //get event by organizer
    List<EventDto> getEventByOrganizer(String organizer);
}
