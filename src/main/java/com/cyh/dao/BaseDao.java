package com.cyh.dao;

/**
 * Author : chyh
 * Date : 2021/3/22
 * Time : 22:45
 */
public interface BaseDao<T> {
    int insert(T object);

    T queryByUserId(String userId);
}
