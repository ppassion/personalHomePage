package com.cyh.dao;

import com.cyh.bean.MyUser;
import com.cyh.dao.user.UserDaoImpl;
import lombok.extern.java.Log;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Log
@SpringBootTest
public class MyUserDaoImplTest {

//    @Autowired
//    private UserDaoImpl userDao;

    @Test
    public void testQueryUserInfo() {
        UserDaoImpl userDao = new UserDaoImpl();
        MyUser myUser = userDao.queryUserInfo();
        System.out.println(myUser);
    }

    @Test
    public void testInsert() {
        UserDaoImpl userDao = new UserDaoImpl();
        MyUser myUser = new MyUser();
        myUser.setAddress("0323");
        userDao.insert(myUser);
    }
}