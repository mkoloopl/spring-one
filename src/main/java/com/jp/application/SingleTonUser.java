package com.jp.application;


public class SingleTonUser {

    private SingleTonUser(){}

    private static SingleTonUser singleTonUser;

    public static SingleTonUser getInstance(){
        if(singleTonUser == null){
            singleTonUser = new SingleTonUser();
        }
        return singleTonUser;
    }
}
