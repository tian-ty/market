package com.tiany.market.service;

import com.tiany.market.entity.User;

public interface UserService {

    int userRegister(User user);

    User userLogin(String username,String password);

}
