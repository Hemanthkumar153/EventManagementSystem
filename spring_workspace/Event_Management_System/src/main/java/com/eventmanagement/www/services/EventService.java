package com.eventmanagement.www.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventmanagement.ww.repository.EventRepository;
import com.eventmanagement.www.models.Event;

@Service
public class EventService  {
    @Autowired
    private EventRepository eventRepository;

    
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    
    public Optional<Event> getEventById(Long id) {
        return eventRepository.findById(id);
    }

  
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}
