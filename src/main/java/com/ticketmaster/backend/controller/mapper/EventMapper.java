package com.ticketmaster.backend.controller.mapper;

import com.ticketmaster.backend.entity.Event;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EventMapper {

    public EventList convertToEventList (List<Event> events) {
        return EventList.builder()
                .eventList(events.stream().collect(Collectors.toList()))
                .build();

    }
}
