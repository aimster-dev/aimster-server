package com.aimster.aimsterserver.mappers;

import com.aimster.aimsterserver.objects.models.User;
import com.aimster.aimsterserver.objects.requests.CreateUserRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;

@Mapper
public interface UserMapper {
    User getUserById(@Param("id") Long id);

    void insertUser(@Param("request") CreateUserRequest request);

    void deleteUserById(@Param("id") Long id);
}
