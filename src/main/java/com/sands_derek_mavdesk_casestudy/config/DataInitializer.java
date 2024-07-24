package com.sands_derek_mavdesk_casestudy.config;

import com.sands_derek_mavdesk_casestudy.models.Role;
import com.sands_derek_mavdesk_casestudy.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private RoleService roleService;

    @Override
    public void run(String... args) throws Exception {
        if (roleService.getRoleByName("USER") == null) {
            roleService.saveRole(new Role("USER"));
        }
        if (roleService.getRoleByName("ADMIN") == null) {
            roleService.saveRole(new Role("ADMIN"));
        }
    }
}
