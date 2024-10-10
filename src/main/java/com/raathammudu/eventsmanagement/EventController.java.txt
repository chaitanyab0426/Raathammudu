package com.raathammudu.eventsmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/all")
    public List<Event> getAll() {
        return eventService.findAll();
    }

    @PostMapping("/create")
    public Event create(@RequestBody Event event) {
        return eventService.save(event);
    }
}
