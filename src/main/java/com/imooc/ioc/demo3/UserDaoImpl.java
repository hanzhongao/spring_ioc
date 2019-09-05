package com.imooc.ioc.demo3;

/**
 * Create by hza
 * 2019-09-05 13:58
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("保存用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }

    @Override
    public void findAll() {
        System.out.println("查找用户");
    }
}
