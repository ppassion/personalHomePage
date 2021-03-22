package com.cyh.dao.mapper;

import com.cyh.bean.User;
import org.springframework.stereotype.Repository;

/**
 * Author : chyh
 * Date : 2021/3/18
 * Time : 11:04
 */

@Repository
public interface IUserMapper {
    User queryUserInfo();
}
