package com.sands_derek_mavdesk_casestudy.controllers;

import com.sands_derek_mavdesk_casestudy.models.Ticket;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Arrays;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        List<Ticket> tickets = Arrays.asList(

        );

        model.addAttribute("tickets", tickets);
        return "dashboard";
    }

    public static class Ticket {
        private String title;
        private String lastReplyBy;
        private String createdDate;
        private String updatedDate;
        private String status;
    }
}
