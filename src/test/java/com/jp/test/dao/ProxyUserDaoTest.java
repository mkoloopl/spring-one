package com.jp.test.dao;

import com.jp.application.UserDaoImpl;
import org.junit.Test;

public class ProxyUserDaoTest {

    @Test
    public void ProxyUserDaoTest(){
        ProxyUserDao proxyUserDao = new ProxyUserDao(new UserDaoImpl());
        proxyUserDao.save();
    }
}
