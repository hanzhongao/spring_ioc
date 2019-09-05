package com.imooc.ioc.demo4;

/**
 * Create by hza
 * 2019-09-05 15:20
 * 商品种类
 */
public class Category {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
