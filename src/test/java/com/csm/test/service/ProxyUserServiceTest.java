package com.csm.test.service;

import com.csm.service.UserService;
import com.csm.service.impl.UserServiceImpl;
import com.csm.test.proxy.ProxyJDK;
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
