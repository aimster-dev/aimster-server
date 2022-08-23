package com.aimster.aimsterserver.mappers;

import com.aimster.aimsterserver.models.Example;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExampleMapper {

    void insertExample(@Param("text") String text);
    Example getExampleById(@Param("id") Long id);

}
