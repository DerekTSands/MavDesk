package com.sands_derek_mavdesk_casestudy.services;

import com.sands_derek_mavdesk_casestudy.dao.UserProfileRepository;
import com.sands_derek_mavdesk_casestudy.models.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    public UserProfile saveUserProfile(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    public UserProfile getUserProfileByUserId(Long userId) {
        return userProfileRepository.findByUserId(userId);
    }
}
