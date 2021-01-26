package com.csm.test.dao;

import com.csm.dao.impl.UserDaoImpl;
import org.junit.Test;

public class ProxyUserDaoTest {

    @Test
    public void ProxyUserDaoTest(){
        ProxyUserDao proxyUserDao = new ProxyUserDao(new UserDaoImpl());
        proxyUserDao.save();
    }
}
