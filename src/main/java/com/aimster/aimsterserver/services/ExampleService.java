package com.aimster.aimsterserver.services;

import com.aimster.aimsterserver.dao.Example;
import com.aimster.aimsterserver.mappers.ExampleMapper;
import com.aimster.aimsterserver.validators.ExampleValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    @Autowired
    private ExampleValidator exampleValidator;

    @Autowired
    private ExampleMapper exampleMapper;

    public Example getExampleById(Long id) {

        // These two validator methods should be combined into a common .validate() method
        exampleValidator.isUserAutheticated(/* user info will be param here */);

        exampleValidator.isInputValid();

        return exampleMapper.getExampleById(id);
    }

    public void insertExample(String value) {

        exampleValidator.isUserAutheticated(/* user info will be param here */);

        exampleValidator.isInputValid();

        exampleMapper.insertExample(value);
    }


}
