package com.aimster.aimsterserver.mappers;

import com.aimster.aimsterserver.objects.models.User;
import com.aimster.aimsterserver.objects.requests.CreateUserRequest;
import com.aimster.aimsterserver.objects.requests.UpdateUserRequest;
import com.aimster.aimsterserver.objects.responses.UserProfileResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    UserProfileResponse getUserById(@Param("id") Long id);

    void insertUser(@Param("request") CreateUserRequest request);

    void deleteUserById(@Param("id") Long id);

    void updateUser(@Param("request") UpdateUserRequest request);
}
