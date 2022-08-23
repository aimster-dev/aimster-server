package com.aimster.aimsterserver.mappers;

import com.aimster.aimsterserver.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User getUserById(@Param("id") Long id);
}
