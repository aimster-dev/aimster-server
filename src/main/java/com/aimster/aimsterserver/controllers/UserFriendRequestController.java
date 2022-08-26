package com.aimster.aimsterserver.controllers;

import com.aimster.aimsterserver.objects.models.User;
import com.aimster.aimsterserver.objects.requests.CreateUserFriendRequestRequest;
import com.aimster.aimsterserver.objects.requests.CreateUserRequest;
import com.aimster.aimsterserver.objects.responses.UserFriendRequestResponse;
import com.aimster.aimsterserver.objects.responses.UserProfileResponse;
import com.aimster.aimsterserver.services.UserFriendRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/user_friend_request")
public class UserFriendRequestController {

    @Autowired
    private UserFriendRequestService userFriendRequestService;

    @RequestMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.GET,
            path = "/{id}"
    )
    @ResponseBody
    public List<UserFriendRequestResponse> getUserPendingFriendRequests(HttpServletRequest httpRequest, @PathVariable Long id) {
        return userFriendRequestService.getUserPendingFriendRequests(id);
    }

    @RequestMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.DELETE,
            path = "/{id}"
    )
    @ResponseBody
    public void deleteUserPendingFriendRequestById(HttpServletRequest httpRequest, @PathVariable Long id) {
        userFriendRequestService.deleteUserPendingFriendRequestById(id);
    }

    @RequestMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.POST
    )
    @ResponseBody
    public Long insertUserFriendRequest(HttpServletRequest httpRequest, @RequestBody CreateUserFriendRequestRequest request) {
        return userFriendRequestService.insertUserFriendRequest(request);
    }



}
