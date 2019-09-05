package com.imooc.ioc.demo3;

/**
 * Bean的生命周期
 */
public class Man {
    public Man() {
        System.out.println("Man被实例化了...");
    }

    public void init() {
        System.out.println("Man被初始化了...");
    }

    public void destroy() {
        System.out.println("Man被销毁了.....");
    }
}
