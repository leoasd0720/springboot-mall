package com.leoasd0720.springbootmall.service;

import com.leoasd0720.springbootmall.dto.UserLoginRequest;
import com.leoasd0720.springbootmall.dto.UserRegisterRequest;
import com.leoasd0720.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);

    User login (UserLoginRequest userLoginRequest);

}
