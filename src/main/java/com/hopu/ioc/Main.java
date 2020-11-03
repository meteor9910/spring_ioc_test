package com.hopu.ioc;

public class Main {
    public static void main(String[] args) {
        User user =(User) BeanFactory.getBean("user");
        user.study();
    }
}
