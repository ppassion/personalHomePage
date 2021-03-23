package com.cyh.action;

import com.cyh.bean.MyUser;
import com.cyh.service.UserService;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log
class MyUserActionTest {

    @Autowired
    private UserService userService;

    @Test
    void queryUserInfo() {
        MyUser myUser = userService.queryUserInfo();
        log.info(myUser.toString());
    }
}