package com.zjj.mapper;

import com.zjj.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User login(String username, String password);
}
