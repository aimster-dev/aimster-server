package com.aimster.aimsterserver.services;

import com.aimster.aimsterserver.models.User;
import com.aimster.aimsterserver.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }

}
