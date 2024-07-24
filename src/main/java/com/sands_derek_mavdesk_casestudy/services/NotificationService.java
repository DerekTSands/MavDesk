package com.sands_derek_mavdesk_casestudy.services;

import com.sands_derek_mavdesk_casestudy.models.Notification;
import java.util.List;

public interface NotificationService {
    Notification saveNotification(Notification notification);
    List<Notification> getAllNotifications();
    Notification getNotificationById(Long id);
    void deleteNotification(Long id);
}
