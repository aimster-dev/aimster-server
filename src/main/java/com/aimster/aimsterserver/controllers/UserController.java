package com.aimster.aimsterserver.controllers;

import com.aimster.aimsterserver.models.User;
import com.aimster.aimsterserver.services.UserService;
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


}
