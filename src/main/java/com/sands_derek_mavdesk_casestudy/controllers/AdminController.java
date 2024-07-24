package com.sands_derek_mavdesk_casestudy.controllers;

import com.sands_derek_mavdesk_casestudy.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/admin")
    public String showAdminDashboard(Model model) {
        model.addAttribute("roles", roleService.getAllRoles());
        return "admin_dashboard";
    }
}
