package com.aimster.aimsterserver.mappers;

import com.aimster.aimsterserver.objects.models.User;
import com.aimster.aimsterserver.objects.responses.UserProfileResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserFriendRequestMapper {

    List<UserProfileResponse> getUsersPendingFriendRequests(@Param("id") Long id);

}
