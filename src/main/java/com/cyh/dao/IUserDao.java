package com.cyh.dao;

import com.cyh.bean.User;
import org.springframework.stereotype.Service;

/**
 * Author : chyh
 * Date : 2021/3/18
 * Time : 11:20
 */

@Service
public interface IUserDao{
    User queryUserInfo();
}
