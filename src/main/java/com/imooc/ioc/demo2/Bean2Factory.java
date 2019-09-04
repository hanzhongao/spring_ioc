package com.imooc.ioc.demo2;

import java.sql.SQLOutput;

/**
 *  Bean2 静态工厂
 */
public class Bean2Factory {
    public static Bean2 getInstance() {
        System.out.println("Bean2工厂已执行.......");
        return new Bean2() ;
    }
}
