package com.cyh.service;

import com.cyh.bean.MyUser;
import com.cyh.dao.user.IUserDao;
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
    private IUserDao userDao;


    public MyUser queryUserInfo() {
        return userDao.queryUserInfo();
    }
}
