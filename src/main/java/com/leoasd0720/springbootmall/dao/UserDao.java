package com.leoasd0720.springbootmall.dao;

import com.leoasd0720.springbootmall.dto.UserRegisterRequest;
import com.leoasd0720.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
