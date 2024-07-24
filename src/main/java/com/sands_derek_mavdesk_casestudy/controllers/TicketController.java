package com.sands_derek_mavdesk_casestudy.controllers;

import com.sands_derek_mavdesk_casestudy.models.Ticket;
import com.sands_derek_mavdesk_casestudy.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/ticket/form")
    public String showTicketForm(Model model) {
        model.addAttribute("ticket", new Ticket());
        return "ticket_form"; // Ensure this matches your ticket form template name
    }

    @PostMapping("/ticket/submit")
    public String submitTicket(@ModelAttribute Ticket ticket) {
        ticketService.saveTicket(ticket);
        return "redirect:/ticket/form?success";
    }
}
