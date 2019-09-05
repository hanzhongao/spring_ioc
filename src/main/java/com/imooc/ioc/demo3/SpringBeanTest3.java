package com.imooc.ioc.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的作用范围测试
 */
public class SpringBeanTest3 {
    @Test
    public void test1() {
        // 创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        // 通过工厂创建类
        Persion persion1 = (Persion) applicationContext.getBean("persion");
        Persion persion2 = (Persion) applicationContext.getBean("persion");

        System.out.println(persion1);
        System.out.println(persion2);
    }

    @Test
    /**
     * Bean的生命周期
     */
    public void test2() {
        // 创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        // 通过工厂创建类
        Man man = (Man) applicationContext.getBean("man");

        ((ClassPathXmlApplicationContext) applicationContext).close();

    }
}
