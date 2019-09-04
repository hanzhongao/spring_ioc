package com.imooc.ioc.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  Bean 的三种实例化方法
 */
public class SpringBeanTest {
    @Test
    /**
     * 无参构造实例化方式
     */
    public void test1() {
        // 创建工厂
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        // 通过工厂取得实例化对象
        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1") ;
    }

    @Test
    /**
     * 静态工厂实例化方式
     */
    public void test2() {
        // 创建工厂
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        // 通过工厂取得实例化对象
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2") ;
    }

    @Test
    /**
     * 实例工厂实例化方式
     */
    public void test3() {
        // 创建工厂
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        // 通过工厂取得实例化对象
        Bean3 bean3 = (Bean3) applicationContext.getBean("bean3") ;
    }
}
