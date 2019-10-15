package com.tiany.market.service.serviceImpl;

import com.tiany.market.dao.UserMapper;
import com.tiany.market.entity.User;
import com.tiany.market.entity.UserExample;
import com.tiany.market.service.UserService;
import com.tiany.market.util.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int userRegister(User user) {
        if (isExistUsername(user.getUsername().toLowerCase()))
        {
            throw new MyException("该登录名已被占用！！");
        }
        int count = userMapper.insertSelective(user);

        return count > 0 ? 1 : 0;
    }

    @Override
    public User userLogin(String username, String password) {
        return null;
    }

    private boolean isExistUsername(String username)
    {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        long count = userMapper.countByExample(example);
        if (count > 0)
        {
            return true;
        }
        return false;
    }
}
