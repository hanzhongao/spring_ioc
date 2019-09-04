package com.imooc.ioc.demo1;

/**
 * Create by hza
 * 2019-09-04 16:48
 */
public class UserServiceImpl implements UserService {

    private String name ;

    @Override
    public void sayHello() {
        System.out.println("hello spring " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
