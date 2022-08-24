package com.aimster.aimsterserver.controllers;

import com.aimster.aimsterserver.objects.models.User;
import com.aimster.aimsterserver.objects.requests.CreateUserRequest;
import com.aimster.aimsterserver.services.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.GET,
            path = "/{id}"
    )
    @ResponseBody
    public User getUserById(HttpServletRequest httpRequest, @PathVariable Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.POST
    )
    @ResponseBody
    public Long insertUser(HttpServletRequest httpRequest, @RequestBody CreateUserRequest request) {
        return userService.insertUser(request);
    }


}
