package com.cyh.dao.user;

import com.cyh.bean.MyUser;
import com.cyh.dao.common.IBaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


@Service
public class UserDaoImpl implements IUserDao, IBaseDao<MyUser> {
    @Autowired
    private IUserMapper userMapper;


    @Override
    public MyUser queryUserInfo() {
        return userMapper.queryUserInfo();
    }

    public void insert(MyUser myUser) {

    }

    @Override
    public int save(MyUser entity, String sqlId) {
        return 0;
    }

    @Override
    public int save(MyUser entity) {
        return 0;
    }

    @Override
    public int delete(Serializable id, String sqlId) {
        return 0;
    }

    @Override
    public int delete(Serializable id) {
        return 0;
    }

    @Override
    public int update(MyUser entity, String sqlId) {
        return 0;
    }

    @Override
    public int update(MyUser entity) {
        return 0;
    }

    @Override
    public MyUser getById(Serializable id, String sqlId) {
        return null;
    }

    @Override
    public MyUser getById(Serializable id) {
        return null;
    }

    @Override
    public List<MyUser> getAll(String sqlId) {
        return null;
    }

    @Override
    public List<MyUser> getAll() {
        return null;
    }

    @Override
    public Integer getCount(String sqlId) {
        return null;
    }

    @Override
    public Integer getCount() {
        return null;
    }

    @Override
    public List<MyUser> getWithCondition(MyUser entity, String sqlId) {
        return null;
    }

    @Override
    public List<MyUser> getWithCondition(MyUser entity) {
        return null;
    }

    @Override
    public Integer getCountWithCondition(MyUser entity, String sqlId) {
        return null;
    }

    @Override
    public Integer getCountWithCondition(MyUser entity) {
        return null;
    }

    @Override
    public List<MyUser> getWithCondition(Map<String, ?> param, String sqlId) {
        return null;
    }

    @Override
    public List<MyUser> getWithCondition(Map<String, ?> param) {
        return null;
    }

    @Override
    public Integer getCountWithCondition(Map<String, ?> param, String sqlId) {
        return null;
    }

    @Override
    public Integer getCountWithCondition(Map<String, ?> param) {
        return null;
    }
}
