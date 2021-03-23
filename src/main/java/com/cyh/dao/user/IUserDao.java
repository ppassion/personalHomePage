package com.cyh.dao.user;

import com.cyh.bean.MyUser;
import org.springframework.stereotype.Service;

/**
 * Author : chyh
 * Date : 2021/3/18
 * Time : 11:20
 */

@Service
public interface IUserDao {
    MyUser queryUserInfo();
}
