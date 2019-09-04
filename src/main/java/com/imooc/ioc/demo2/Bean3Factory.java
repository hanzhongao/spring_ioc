package com.imooc.ioc.demo2;

/**
 *  Bean3实例工厂
 */
public class Bean3Factory {
    public Bean3 getInstance() {
        System.out.println("Bean3工厂已执行.......");
        return new Bean3() ;
    }
}
