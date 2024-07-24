package com.sands_derek_mavdesk_casestudy.dao;

import com.sands_derek_mavdesk_casestudy.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    // Custom queries if needed
}
