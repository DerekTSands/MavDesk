package com.sands_derek_mavdesk_casestudy.dao;

import com.sands_derek_mavdesk_casestudy.models.TicketComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketCommentRepository extends JpaRepository<TicketComment, Long> {
}
