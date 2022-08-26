package com.aimster.aimsterserver.services;

import com.aimster.aimsterserver.mappers.UserFriendRequestMapper;
import com.aimster.aimsterserver.objects.responses.UserProfileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserFriendRequestService {

    @Autowired
    private UserFriendRequestMapper userFriendRequestMapper;

    @Transactional
    public List<UserProfileResponse> getUsersPendingFriendRequests(Long id) {
        return userFriendRequestMapper.getUsersPendingFriendRequests(id);
    }
}
