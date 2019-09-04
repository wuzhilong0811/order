package com.csdj.user.dao;

import com.csdj.user.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @ClassName UserMapper
 * @Author wuzl
 * @Date 2019/9/3
 **/
@Repository
public interface UserMapper {
    public int countUser(User user);
}
