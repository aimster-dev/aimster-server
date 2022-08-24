package com.aimster.aimsterserver.controllers;

import com.aimster.aimsterserver.objects.models.Example;
import com.aimster.aimsterserver.services.ExampleService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/*
    This is a controller. There should be NO business logic except calling service method and input validation.
    This is an entry point.

    @RequestParam - can be used instead of @PathVariable
    RequestParam example www.google.com/search?name=gods     @RequestParam param would be = to "gods"
    PathVariable example can be seen below
 */
@RestController
@RequestMapping("/api/example")
public class ExampleController {

    @Autowired
    private ExampleService exampleService;

    @RequestMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.GET,
            path = "/{id}"
    )
    @ResponseBody
    public Example getExampleById(HttpServletRequest httpRequest, @PathVariable Long id) {
        return exampleService.getExampleById(id);
    }

    // What to return on void method?
    // https://stackoverflow.com/questions/12837907/what-to-return-if-spring-mvc-controller-method-doesnt-return-value
    // Undecided
    @RequestMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.POST
    )
    @ResponseBody
    public void insertExample(HttpServletRequest httpRequest, @RequestBody String request) {

        // Any insert or create method should return the new ID of the entry.

        // All of this is only needed because it's a String and I couldn't figure out how to parse it.
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode node = mapper.readTree(request);
            request = String.valueOf(node.get("request"));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        exampleService.insertExample(request);
    }

}
