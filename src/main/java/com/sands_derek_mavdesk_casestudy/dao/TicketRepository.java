package com.sands_derek_mavdesk_casestudy.dao;

import com.sands_derek_mavdesk_casestudy.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    @Query("SELECT t FROM Ticket t WHERE t.status = ?1")
    List<Ticket> findByStatus(String status);
}
