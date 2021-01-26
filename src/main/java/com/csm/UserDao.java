package com.csm;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public void save(){
        System.out.println("userDao save");
    }
}
