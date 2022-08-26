package com.aimster.aimsterserver.mappers;

import com.aimster.aimsterserver.objects.models.User;
import com.aimster.aimsterserver.objects.requests.CreateUserFriendRequestRequest;
import com.aimster.aimsterserver.objects.responses.UserFriendRequestResponse;
import com.aimster.aimsterserver.objects.responses.UserProfileResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserFriendRequestMapper {

    List<UserFriendRequestResponse> getUserPendingFriendRequests(@Param("id") Long id);

    void deleteUserPendingFriendRequestById(@Param("id") Long id);

    Long insertUserFriendRequest(@Param("request") CreateUserFriendRequestRequest request);

}
