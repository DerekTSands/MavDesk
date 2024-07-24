package com.sands_derek_mavdesk_casestudy.services;

import com.sands_derek_mavdesk_casestudy.models.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User getUserByUsername(String username);
    void deleteUser(Long id);
}
