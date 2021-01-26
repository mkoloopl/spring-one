package com.jp.application;

import com.jp.application.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {

        System.out.println("userDao save");
    }
}
