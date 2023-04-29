package com.criss.travelweb.Dao;

import com.criss.travelweb.Entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PostTest {

    @Autowired
    private PostDao postDao;

    @Autowired
    private UserDao userDao;


    @Test //失败
    void test1(){
        System.out.println(postDao.getAll());
    }

    @Test //成功
    void test2(){
        System.out.println(userDao.getAll());
    }

}
