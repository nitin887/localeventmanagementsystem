package com.localeventmanagementsysytem.localeventmanagementsystem.service;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.EventDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.entity.Event;
import com.localeventmanagementsysytem.localeventmanagementsystem.entity.EventStatus;
import com.localeventmanagementsysytem.localeventmanagementsystem.exception.EventNotFoundException;
import com.localeventmanagementsysytem.localeventmanagementsystem.mapper.EventMapper;
import com.localeventmanagementsysytem.localeventmanagementsystem.repository.EventRepository;
import com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface.EventServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EventService implements EventServiceInterface {
    private final EventRepository eventRepository;
    private final EventMapper eventMapper;

    @Override
    public EventDto createEvent(EventDto eventDto) {
        Event event = eventMapper.toEventEntity(eventDto);
        event = eventRepository.save(event);
        return eventMapper.toEventDto(event);
    }

    @Override
    public EventDto updateEvent(Long id, EventDto eventDto) {
        Event existingEvent = eventRepository.findById(id).orElseThrow(() -> new EventNotFoundException("Event not found with id: " + id));
        existingEvent.setTitle(eventDto.getTitle());
        existingEvent.setDescription(eventDto.getDescription());
        existingEvent.setCategory(eventDto.getCategory());
        existingEvent.setLocation(eventDto.getLocation());
        existingEvent.setStartTime(eventDto.getStartTime());
        existingEvent.setEndTime(eventDto.getEndTime());
        existingEvent.setMaxAttendees(eventDto.getMaxAttendees());
        existingEvent.setStatus(eventDto.getStatus());
        existingEvent = eventRepository.save(existingEvent);
        return eventMapper.toEventDto(existingEvent);
    }

    @Override
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public EventDto getEventById(Long id) {
        return eventRepository.findById(id).map(eventMapper::toEventDto).orElseThrow(() -> new EventNotFoundException("Event not found with id: " + id));
    }

    @Override
    public List<EventDto> getAllEvents() {
        return eventRepository.findAll().stream().map(eventMapper::toEventDto).collect(Collectors.toList());
    }

    @Override
    public List<EventDto> getEventByTitle(String title) {
        return eventRepository.findByTitleContaining(title).stream().map(eventMapper::toEventDto).collect(Collectors.toList());
    }

    @Override
    public List<EventDto> getEventByDescription(String description) {
        return eventRepository.findByDescriptionContaining(description).stream().map(eventMapper::toEventDto).collect(Collectors.toList());
    }

    @Override
    public List<EventDto> getEventByDate(LocalDate date) {
        return eventRepository.findByStartTimeBetween(date.atStartOfDay(), date.atTime(LocalTime.MAX)).stream().map(eventMapper::toEventDto).collect(Collectors.toList());
    }

    @Override
    public List<EventDto> getEventByTime(LocalTime time) {
        // This is not an efficient query. For better performance, consider querying by date first.
        return eventRepository.findAll().stream()
                .filter(event -> event.getStartTime().toLocalTime().equals(time))
                .map(eventMapper::toEventDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<EventDto> getEventByLocation(String location) {
        return eventRepository.findByLocation(location).stream().map(eventMapper::toEventDto).collect(Collectors.toList());
    }

    @Override
    public List<EventDto> getEventByCategory(String category) {
        return eventRepository.findByCategory(category).stream().map(eventMapper::toEventDto).collect(Collectors.toList());
    }

    @Override
    public List<EventDto> getEventByOrganizer(String organizer) {
        return eventRepository.findByCreatedBy_Username(organizer).stream().map(eventMapper::toEventDto).collect(Collectors.toList());
    }

    @Override
    public List<EventDto> getEventsByStatus(EventStatus status) {
        return eventRepository.findByStatus(status).stream().map(eventMapper::toEventDto).collect(Collectors.toList());
    }
}
