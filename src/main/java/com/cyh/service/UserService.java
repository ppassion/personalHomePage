package com.cyh.service;

import com.cyh.bean.User;
import com.cyh.dao.IUserDao;
import com.cyh.dao.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author : chyh
 * Date : 2021/3/18
 * Time : 11:22
 */

@Service
public class UserService {
    @Autowired
    private IUserMapper userDao;


    public User queryUserInfo() {
        return userDao.queryUserInfo();
    }
}
