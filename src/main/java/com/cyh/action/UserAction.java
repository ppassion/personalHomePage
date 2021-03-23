package com.cyh.action;

import com.cyh.bean.MyUser;
import com.cyh.dao.user.UserDaoImpl;
import com.cyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author : chyh
 * Date : 2021/3/18
 * Time : 10:52
 */

@Controller
@RequestMapping("user")
public class UserAction {

    @Autowired
    private UserService userService;
    @Autowired
    private UserDaoImpl userDao;

    @ResponseBody
    @RequestMapping("queryUserInfo")
    public MyUser queryUserInfo() {
        return userService.queryUserInfo();
    }

    @ResponseBody
    @RequestMapping("insertUser")
    public void insertUser() {
        MyUser myUser = new MyUser();
        myUser.setAddress("0323");
        userDao.insert(myUser);
    }
}
