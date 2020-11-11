package com.ticketmaster.backend.service.event;

import com.ticketmaster.backend.entity.event.Event;
import com.ticketmaster.backend.repository.event.EventRepository;
import com.ticketmaster.backend.service.event.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> findAllEvents() {
        return eventRepository.findAll();
    }
}
