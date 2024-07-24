package com.sands_derek_mavdesk_casestudy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/submit_ticket")
    public String showSubmitTicketPage() {
        return "ticket_form";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }
}
