package com.aimster.aimsterserver.validators;

import org.springframework.stereotype.Service;

@Service
public class ExampleValidator {

    public void isUserAutheticated(/* User param blah blah... */) {

        /* Check if user is permitted to do action and session is valid  */
        /* Throw custom error if fail */
    }

    public void isInputValid(/* HTTP body object param */) {

        /* Validate HTTP request body ... etc */
        /* Throw custom error if fail */

    }

    public void isInputValid(String request) {

        /* Validate HTTP request body ... etc */
        /* Throw custom error if fail */

    }



}
