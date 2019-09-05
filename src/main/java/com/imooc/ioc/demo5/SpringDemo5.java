package com.imooc.ioc.demo5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by hza
 * 2019-09-05 15:57
 */
public class SpringDemo5 {
    @Test
    public void test1() {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionBean);
    }
}
