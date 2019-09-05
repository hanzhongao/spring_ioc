package com.imooc.ioc.demo4;

/**
 * Create by hza
 * 2019-09-05 14:39
 */
public class User {
    private String name ;
    private Integer age ;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
