package com.cyh.dao.user;

import com.cyh.bean.MyUser;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author : chyh
 * Date : 2021/3/18
 * Time : 11:04
 */


@Mapper
public interface IUserMapper {
    MyUser queryUserInfo();


    void insert(MyUser myUser);
}
