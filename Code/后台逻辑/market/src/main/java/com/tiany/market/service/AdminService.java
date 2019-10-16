package com.tiany.market.service;

import com.tiany.market.entity.Admin;

public interface AdminService {

    Admin adminLogin(String username, String password);

}
