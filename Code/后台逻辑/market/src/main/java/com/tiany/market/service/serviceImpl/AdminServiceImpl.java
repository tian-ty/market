package com.tiany.market.service.serviceImpl;

import com.tiany.market.dao.AdminMapper;
import com.tiany.market.entity.Admin;
import com.tiany.market.entity.AdminExample;
import com.tiany.market.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin adminLogin(String username, String password) {
        AdminExample example = new AdminExample();
        example.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<Admin> adminList = adminMapper.selectByExample(example);
        if (adminList != null && adminList.size()>0)
        {
            return adminList.get(0);
        }
        return null;
    }
}
