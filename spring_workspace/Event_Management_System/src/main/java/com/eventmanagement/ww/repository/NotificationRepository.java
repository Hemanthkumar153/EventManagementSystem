package com.eventmanagement.ww.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.eventmanagement.www.models.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
