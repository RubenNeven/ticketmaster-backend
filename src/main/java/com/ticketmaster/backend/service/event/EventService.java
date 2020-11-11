package com.ticketmaster.backend.service.event;

import com.ticketmaster.backend.entity.event.Event;

import java.util.List;

public interface EventService {

    List<Event> findAllEvents();
}
