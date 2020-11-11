package com.ticketmaster.backend.controller.dto.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {
    private Long id;
    private String name;
    private String location;
    private double price;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;
}
