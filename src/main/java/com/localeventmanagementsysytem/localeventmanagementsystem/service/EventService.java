package com.localeventmanagementsysytem.localeventmanagementsystem.service;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.EventDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.entity.Event;
import com.localeventmanagementsysytem.localeventmanagementsystem.exception.EventNotFoundException;
import com.localeventmanagementsysytem.localeventmanagementsystem.mapper.EventMapper;
import com.localeventmanagementsysytem.localeventmanagementsystem.repository.EventRepository;
import com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface.EventServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService implements EventServiceInterface {
    private EventRepository eventRepository;
    private EventMapper eventMapper;

    @Override
    public EventDto createEvent(EventDto eventDto) {
        eventRepository.findById(eventDto.getId()).orElseThrow(()->new EventNotFoundException("event not found with id: "+eventDto.getId()));
        Event creatingEvent =eventMapper.toEventEntity(eventDto);
        creatingEvent =eventRepository.save(creatingEvent);
        return eventMapper.toEventDto(creatingEvent);
    }

    @Override
    public EventDto updateEvent(EventDto eventDto, Long id) {
        Event updatingEvent =eventRepository.findById(id).orElseThrow(()->new EventNotFoundException("event not found with id:"+id));
        updatingEvent.setTitle(eventDto.getTitle());
        updatingEvent.setId(eventDto.getId());
        updatingEvent.setCategory(eventDto.getCategory());
        updatingEvent.setCreatedAt(eventDto.getCreatedAt());
        updatingEvent.setDescription(eventDto.getDescription());
        updatingEvent.setEndTime(eventDto.getEndTime());
        updatingEvent.setStartTime(eventDto.getStartTime());
        updatingEvent.setLocation(eventDto.getLocation());
        updatingEvent.setMaxAttendees(eventDto.getMaxAttendees());
        updatingEvent.setStatus(eventDto.getStatus());
        updatingEvent=eventRepository.save(updatingEvent);
        return eventMapper.toEventDto(updatingEvent);
    }

    @Override
    public EventDto deleteEvent(Long id) {
        Event deletingEvent =eventRepository.findById(id).orElseThrow(()->new EventNotFoundException("event not found with id: "+id));
        eventRepository.delete(deletingEvent);
        return eventMapper.toEventDto(deletingEvent);
    }

    @Override
    public List<EventDto> getEventById(Long id) {
        return Collections.singletonList(eventRepository.findById(id).map(eventMapper::toEventDto).orElseThrow(() -> new EventNotFoundException("event not found with id: " + id)));
    }

    @Override
    public List<EventDto> getAllEvents() {
        return eventRepository.findAll().stream().map(eventMapper::toEventDto).toList();
    }

    @Override
    public List<EventDto> getEventByName(String name) {
        return Collections.singletonList(eventRepository.findByTitle(name).map(eventMapper::toEventDto).orElseThrow(() -> new EventNotFoundException("event not found with name: " + name)));
    }


    @Override
    public List<EventDto> getEventByDate(String date) {
        return null;
    }

    @Override
    public List<EventDto> getEventByTime(String time) {
        return null;
    }

    @Override
    public List<EventDto> getEventByLocation(String location) {
        return null;
    }

    @Override
    public List<EventDto> getEventByCategory(String category) {
        return null;
    }

    @Override
    public List<EventDto> getEventByOrganizer(String organizer) {
        return null;
    }
}
