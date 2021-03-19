package com.cyh.dao;

import com.cyh.bean.User;
import com.cyh.dao.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserDaoImpl implements IUserDao{
    @Autowired
    private IUserMapper userMapper;


    @Override
    public User queryUserInfo() {
        return userMapper.queryUserInfo();
    }
}
