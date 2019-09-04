package com.imooc.ioc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by hza
 * 2019-09-04 16:50
 */
public class SpringDemo1 {
    @Test
    /**
     * 传统开发方式
     */
    public void demo1() {
//        UserService userService = new UserServiceImpl();
        UserServiceImpl userService = new UserServiceImpl();
        userService.setName("张三");
        userService.sayHello();
    }

    @Test
    /**
     * spring开发方式
     */
    public void demo2() {
        // 创建Spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过工厂取得类
        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.sayHello();
    }
}
