package com.eventmanagement.www.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventmanagement.ww.repository.NotificationRepository;
import com.eventmanagement.www.models.Notification;

@Service
public class NotificationService  {
    @Autowired
    private NotificationRepository notificationRepository;

  
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    public Notification createNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    public Optional<Notification> getNotificationById(Long id) {
        return notificationRepository.findById(id);
    }

    public void deleteNotification(Long id) {
        notificationRepository.deleteById(id);
    }
}
