package com.aimster.aimsterserver.controllers;

import com.aimster.aimsterserver.objects.models.User;
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
    public List<UserProfileResponse> getUsersPendingFriendRequests(HttpServletRequest httpRequest, @PathVariable Long id) {
        return userFriendRequestService.getUsersPendingFriendRequests(id);
    }



}
