package com.eventmanagement.ww.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.eventmanagement.www.models.RSVP;

public interface RSVPRepository extends JpaRepository<RSVP, Long> {
}
