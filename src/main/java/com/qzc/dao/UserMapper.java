package com.qzc.dao;

import com.qzc.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public User selectUser(@Param("user") User user);
}
