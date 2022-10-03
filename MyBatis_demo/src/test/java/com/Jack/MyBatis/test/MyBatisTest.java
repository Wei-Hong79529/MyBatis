package com.Jack.MyBatis.test;

import com.Jack.MyBatis.Pojo.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {
    @Test
    public void testMyBatis() throws IOException {
        //1.加載配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //2.創建SQL Builder 建造器
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //3.創建sqlSessionFactory 工廠
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //4.獲取SQL 持久的Session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //5.創建Mapper接口對象 回傳一個可實踐類的對象,getMapper 底層使用一個代理模式
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //6.test 功能
        int result = mapper.insertUser();
        //7.提交事務
        sqlSession.commit();
        System.out.println("結果:"+result);

    }
}
