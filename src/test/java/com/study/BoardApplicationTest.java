package com.study;

import com.study.config.DatabaseConfig;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = DatabaseConfig.class)
class BoardApplicationTests {

    private ApplicationContext context;
    @Autowired
    public void setContext(ApplicationContext context){
        this.context = context;
    }

    private SqlSessionFactory sessionFactory;
    @Autowired
    public void setSessionFactory(SqlSessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    @Test
    void contextLoads() {
    }

    @Test
    public void testByApplicationContext() {
        try {
            System.out.println("=========================");
            System.out.println(context.getBean("sqlSessionFactory"));
            System.out.println("=========================");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testBySqlSessionFactory() {
        try {
            System.out.println("=========================");
            System.out.println(sessionFactory.toString());
            System.out.println("=========================");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}