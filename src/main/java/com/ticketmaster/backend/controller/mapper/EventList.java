package com.ticketmaster.backend.controller.mapper;

import com.ticketmaster.backend.entity.Event;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventList {
    List<Event> eventList;

}
