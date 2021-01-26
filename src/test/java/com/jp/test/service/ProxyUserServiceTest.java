package com.jp.test.service;

import com.jp.application.UserService;
import com.jp.application.UserServiceImpl;
import com.jp.test.proxy.ProxyJDK;
import org.junit.Test;

public class ProxyUserServiceTest {

    @Test
    public void test(){
        ProxyUserService proxyUserService = new ProxyUserService(new UserServiceImpl());
        proxyUserService.save();
    }

    @Test
    public void testProxyUserServiceJDK(){
        ProxyJDK proxyJDK = new ProxyJDK(new UserServiceImpl());
        UserService userService = (UserService) proxyJDK.getProxy();
        userService.update();
    }
}
