package com.ticketmaster.backend.service;

import com.ticketmaster.backend.entity.Event;

import java.util.List;

public interface EventService {

    List<Event> findAllEvents();
}
