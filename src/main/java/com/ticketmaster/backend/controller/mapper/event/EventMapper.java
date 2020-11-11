package com.ticketmaster.backend.controller.mapper.event;

import com.ticketmaster.backend.controller.dto.event.EventDto;
import com.ticketmaster.backend.controller.dto.event.EventList;
import com.ticketmaster.backend.entity.event.Event;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EventMapper {

    public Event map(EventDto eventDto){
        return Event.builder()
                .id(eventDto.getId())
                .name(eventDto.getName())
                .location(eventDto.getLocation())
                .price(eventDto.getPrice())
                .dateFrom(eventDto.getDateFrom())
                .dateTo(eventDto.getDateTo())
                .build();
    }

    public EventDto map(Event event){
        return EventDto.builder()
                .id(event.getId())
                .name(event.getName())
                .location(event.getLocation())
                .price(event.getPrice())
                .dateFrom(event.getDateFrom())
                .dateTo(event.getDateTo())
                .build();
    }


    public EventList convertToEventList (List<EventDto> events) {
        return EventList.builder()
                .eventList(events.stream().collect(Collectors.toList()))
                .build();

    }
}
