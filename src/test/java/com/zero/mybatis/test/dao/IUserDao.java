package com.zero.mybatis.test.dao;

/**
 * @author zero
 * @description IUserDao
 * @date 2022/6/15 9:44
 */
public interface IUserDao {
    String queryUserName(String userId);

    Integer queryUserAge(String userId);
}
