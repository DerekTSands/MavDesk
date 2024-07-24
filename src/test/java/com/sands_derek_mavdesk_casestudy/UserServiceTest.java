package com.sands_derek_mavdesk_casestudy;

import com.sands_derek_mavdesk_casestudy.models.User;
import com.sands_derek_mavdesk_casestudy.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSaveUser() {
        User user = new User();
        user.setUsername("testuser");
        user.setPassword("password");
        user.setEmail("test@example.com");

        User savedUser = userService.saveUser(user);
        assertNotNull(savedUser);
        assertNotNull(savedUser.getId());
    }
}
