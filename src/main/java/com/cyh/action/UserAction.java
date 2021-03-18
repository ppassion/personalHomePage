package com.cyh.action;

import com.cyh.bean.User;
import com.cyh.dao.UserDaoImpl;
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

    @ResponseBody
    @RequestMapping("queryUserInfo")
    public User queryUserInfo() {
        return userService.queryUserInfo();
    }
}
