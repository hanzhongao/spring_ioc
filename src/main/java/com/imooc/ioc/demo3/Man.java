package com.imooc.ioc.demo3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Bean的生命周期
 */
public class Man implements BeanNameAware, ApplicationContextAware, InitializingBean,DisposableBean {

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2、设置属性");
        this.name = name;
    }

    public Man() {
        System.out.println("1、Man被实例化了...");
    }

    public void setup() {
        System.out.println("7、Man被初始化了...");
    }

    public void teardown() {
        System.out.println("11、Man被销毁了");
    }


    @Override
    public void setBeanName(String s) {
        System.out.println("3、执行setBeanName方法,设置Bean名称");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("4、了解工厂信息");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6、属性设置后执行");
    }

    public void run() {
        System.out.println("9、执行Bean类中的业务方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("10、执行Spring中的销毁方法");
    }
}
