package com.cyh.dao;

import com.cyh.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImplTest {

    @Test
    public void testQueryUserInfo() {
        UserDaoImpl userDao = new UserDaoImpl();
        User user = userDao.queryUserInfo();
        System.out.println(user);
    }
}