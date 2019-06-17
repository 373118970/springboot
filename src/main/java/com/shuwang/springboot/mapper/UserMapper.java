package com.shuwang.springboot.mapper;

import com.shuwang.springboot.base.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    User Sel(int id);
    List<User> UserAll();
}
