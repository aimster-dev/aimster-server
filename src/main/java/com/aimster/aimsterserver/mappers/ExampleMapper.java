package com.aimster.aimsterserver.mappers;

import com.aimster.aimsterserver.dao.Example;

public interface ExampleMapper {

    void insertExample(String text);
    Example getExampleById(Long id);

}
