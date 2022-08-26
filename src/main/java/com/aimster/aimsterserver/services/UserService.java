package com.aimster.aimsterserver.services;

import com.aimster.aimsterserver.objects.models.User;
import com.aimster.aimsterserver.mappers.UserMapper;
import com.aimster.aimsterserver.objects.requests.CreateUserRequest;
import com.aimster.aimsterserver.objects.requests.UpdateUserRequest;
import com.aimster.aimsterserver.objects.responses.UserProfileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public UserProfileResponse getUserById(Long id) {
        return userMapper.getUserById(id);
    }

    @Transactional
    public Long insertUser(CreateUserRequest request) {
        userMapper.insertUser(request);
        return request.getId();
    }

    @Transactional
    public void deleteUserById(Long id) {

        // TODO delete occurances of ID wherever it exists as a foreign key

        userMapper.deleteUserById(id);
    }

    @Transactional
    public void updateUser(UpdateUserRequest request) {
        userMapper.updateUser(request);
    }



}
