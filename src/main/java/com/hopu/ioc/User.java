package com.hopu.ioc;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {
    private Integer id;
    private String username;
    private String password;
    private Address address;

    //设置数列数组
    private String[] str;
    private List<String> list;
    private Set<String> set;
    //map properties
    private Map<String, String> map;
    private Properties properties;

//    public User(Integer id, String username, String password, Address address) {
//        this.id = id;
//        this.username = username;
//        this.password = password;
//        this.address = address;
//    }
//
//    public User() {
//
//    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setStr(String[] str) {
        this.str = str;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    //     版本一，直接创建类对象
    public  void study(){
        System.out.println("day day up");
//    版本二，直接从工程获取






    }

    public void  init() {
        System.out.println("init");
    }

    public void  destroy() {
        System.out.println("destroy");
    }

}
