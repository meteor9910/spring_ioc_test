package com.hopu.ioc;

public class UserFactory {
    public static User getUser(){
        return new User();
    }
}
