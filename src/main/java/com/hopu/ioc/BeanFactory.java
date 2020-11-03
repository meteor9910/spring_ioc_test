package com.hopu.ioc;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class BeanFactory {
    static Map<String, Object> map = new HashMap<>();

    static {
        try {
//            读取配置文件
            ResourceBundle resourceBundle = ResourceBundle.getBundle("beans");
//            加载配置文件中的name和类

            Enumeration<String> keys = resourceBundle.getKeys();
            while (keys.hasMoreElements()) {
                String key = keys.nextElement();
//                得到类的全限定名
                String className = resourceBundle.getString(key);
//                反射，利用类的全限定名来创建对象
                Class<?> clazz = Class.forName(className);
                Object instance = clazz.newInstance();
                map.put(key, instance);


            }


        } catch (Exception e) {
            e.printStackTrace();


        }
    }

        public static Object getBean (String key){
            return map.get(key);
        }
    }

