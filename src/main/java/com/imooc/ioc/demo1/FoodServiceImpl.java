package com.imooc.ioc.demo1;

/**
 * Create by hza
 * 2019-09-04 17:12
 */
public class FoodServiceImpl implements FoodService {

    private String name ;  // 食品名称
    private String taste ; // 食品口味
    private String kind ;  // 食品种类

    @Override
    public void getInfo() {
        System.out.println(this.name + "属于" + this.kind + ",口味" + this.taste) ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

}
