package com.eventmanagement.ww.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.eventmanagement.www.models.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
