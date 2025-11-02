package com.localeventmanagementsysytem.localeventmanagementsystem.mapper;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.EventDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.entity.Event;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventMapper {

    Event toEventEntity(EventDto eventDto);
    EventDto toEventDto(Event event);
}
