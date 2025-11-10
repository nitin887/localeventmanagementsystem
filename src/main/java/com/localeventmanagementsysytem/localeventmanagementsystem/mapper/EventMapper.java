package com.localeventmanagementsysytem.localeventmanagementsystem.mapper;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.EventDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.entity.Event;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EventMapper {
    @Mapping(source = "createdBy.id", target = "createdBy")
    EventDto toEventDto(Event event);
    @Mapping(source = "createdBy", target = "createdBy.id")
    Event toEventEntity(EventDto eventDto);
}
