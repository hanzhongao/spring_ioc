package com.imooc.ioc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by hza
 * 2019-09-04 17:19
 */
public class FoodTest {
    @Test
    public void test() {
        // 创建工厂类
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        // 通过工厂取得Food类对象
        FoodService foodService = (FoodService) applicationContext.getBean("foodService");

        foodService.getInfo();
    }
}
