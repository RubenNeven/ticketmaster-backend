package com.ticketmaster.backend.controller;

import com.ticketmaster.backend.controller.mapper.EventList;
import com.ticketmaster.backend.controller.mapper.EventMapper;
import com.ticketmaster.backend.entity.Event;
import com.ticketmaster.backend.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EventController {

    private final EventService eventService;
    private final EventMapper eventMapper;

    @Autowired
    public EventController(EventService eventService, EventMapper eventMapper) {
        this.eventService = eventService;
        this.eventMapper = eventMapper;
    }

    @GetMapping("/events")
    public ResponseEntity<EventList> getAllEvents(){
        List<Event> eventList = eventService.findAllEvents();
        EventList events = eventMapper.convertToEventList(eventList.stream().collect(Collectors.toList()));
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(events);
    }
}
