package com.csdj.user.service.impl;

import com.csdj.user.dao.UserMapper;
import com.csdj.user.pojo.User;
import com.csdj.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @ClassName UserServiceImpl
 * @Author wuzl
 * @Date 2019/9/3
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean login(User user) {
        int count = userMapper.countUser(user);
        if(count>0){
            return true;
        }
        return false;
    }
}
