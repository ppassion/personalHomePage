package com.cyh.dao.mapper;

import com.cyh.bean.MyUser;
import com.cyh.dao.user.IUserMapper;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Log
@SpringBootTest
public class IMyUserMapperTest {

    @Autowired
    IUserMapper userMapper;
    @Test
    void queryUserInfo() {
        MyUser myUser = userMapper.queryUserInfo();
        log.info(myUser.toString());
    }
}