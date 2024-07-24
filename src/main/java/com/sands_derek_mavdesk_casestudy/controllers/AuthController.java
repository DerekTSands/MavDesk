package com.sands_derek_mavdesk_casestudy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/auth")  // Base URL for all methods in this controller
public class AuthController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // Return the login page view name
    }

    @PostMapping("/login")
    public ModelAndView handleLoginSubmission(@RequestParam String username, @RequestParam String password) {
        // Handle login submission
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home"); // Redirect to home page after login
        return modelAndView;
    }

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // Return the register page view name
    }

    @PostMapping("/register")
    public ModelAndView handleRegisterSubmission(@RequestParam String username, @RequestParam String password, @RequestParam String email) {
        // Handle registration submission
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login"); // Redirect to login page after registration
        return modelAndView;
    }

    @PostMapping("/reset-password")
    public ModelAndView handleResetPassword(@RequestParam String email) {
        // Handle password reset submission
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("reset-password"); // Redirect to reset password confirmation page
        return modelAndView;
    }
}
