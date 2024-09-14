package com.eventmanagement.www.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventmanagement.ww.repository.RSVPRepository;
import com.eventmanagement.www.models.RSVP;

@Service
public class RSVPService  {
    @Autowired
    private RSVPRepository rsvpRepository;

 
    public List<RSVP> getAllRSVPs() {
        return rsvpRepository.findAll();
    }

 
    public RSVP createRSVP(RSVP rsvp) {
        return rsvpRepository.save(rsvp);
    }


    public Optional<RSVP> getRSVPById(Long id) {
        return rsvpRepository.findById(id);
    }


    public void deleteRSVP(Long id) {
        rsvpRepository.deleteById(id);
    }
}
