package com.sands_derek_mavdesk_casestudy;

import com.sands_derek_mavdesk_casestudy.dao.UserRepository;
import com.sands_derek_mavdesk_casestudy.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByUsername() {
        User user = new User();
        user.setUsername("testuser");
        user.setPassword("password");
        user.setEmail("test@example.com");
        userRepository.save(user);

        User foundUser = userRepository.findByUsername("testuser");
        assertNotNull(foundUser);
        assertEquals("test@example.com", foundUser.getEmail());
    }
}
