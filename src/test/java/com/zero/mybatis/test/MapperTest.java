package com.zero.mybatis.test;

import com.zero.mybatis.binding.MapperProxyFactory;
import com.zero.mybatis.test.dao.IUserDao;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zero
 * @description Test
 * @date 2022/6/15 9:45
 */
public class MapperTest {

   private Logger logger = LoggerFactory.getLogger(MapperTest.class);

    @Test
    public void test_mapperProxyFactory() {
        MapperProxyFactory<IUserDao> factory = new MapperProxyFactory<>(IUserDao.class);
        Map<String, String> sqlSession = new HashMap<>();

        sqlSession.put("com.zero.mybatis.test.dao.IUserDao.queryUserName","模拟执行Mapper.xml中的sql语句，查询名称。");
        sqlSession.put("com.zero.mybatis.test.dao.IUserDao.queryUserAge","模拟执行Mapper.xml中的sql语句，查询年龄。");

        IUserDao userDao = factory.newInstance(sqlSession);
        String res = userDao.queryUserName("1001");
        logger.info("测试结果：{}", res);

    }
}
