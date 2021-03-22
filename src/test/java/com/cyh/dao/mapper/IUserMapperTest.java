package com.cyh.dao.mapper;

import com.cyh.bean.User;
import com.sun.org.apache.bcel.internal.generic.IUSHR;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class IUserMapperTest {

    @Autowired
    IUserMapper userMapper;
    @Test
    void queryUserInfo() {
        User user = userMapper.queryUserInfo();
        System.out.println(user);
    }
}