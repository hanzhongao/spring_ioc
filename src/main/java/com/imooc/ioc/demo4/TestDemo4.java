package com.imooc.ioc.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by hza
 * 2019-09-05 14:42
 */
public class TestDemo4 {
    @Test
    public void test1() {
        // 创建工厂
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        // 通过工厂创建类
        User user = (User) applicationContext.getBean("user") ;

        System.out.println(user);
    }

    @Test
    public void test2() {
        // 创建工厂
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        // 通过工厂创建类
        Persion persion = (Persion) applicationContext.getBean("persion") ;

        System.out.println(persion);
    }

    @Test
    public void test3() {
        // 创建工厂
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        // 通过工厂创建类
        Product product = (Product) applicationContext.getBean("product") ;

        System.out.println(product);
    }
}
