package com.jp.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(){
//        userDao.save();
        System.out.println("userService save");
    }

    @Override
    public void update() {

        System.out.println("update");
    }

}
