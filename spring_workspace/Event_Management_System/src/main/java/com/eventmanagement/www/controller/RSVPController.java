package com.eventmanagement.www.controller;

import com.eventmanagement.www.models.RSVP;
import com.eventmanagement.www.services.RSVPService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rsvps")
public class RSVPController {
    @Autowired
    private RSVPService rsvpService;

    @GetMapping
    public List<RSVP> getAllRSVPs() {
        return rsvpService.getAllRSVPs();
    }

    @PostMapping
    public RSVP createRSVP(@RequestBody RSVP rsvp) {
        return rsvpService.createRSVP(rsvp);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RSVP> getRSVPById(@PathVariable Long id) {
        Optional<RSVP> rsvp = rsvpService.getRSVPById(id);
        return rsvp.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRSVP(@PathVariable Long id) {
        rsvpService.deleteRSVP(id);
        return ResponseEntity.noContent().build();
    }
}
