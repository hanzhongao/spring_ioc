package com.imooc.ioc.demo4;

import java.util.Random;

/**
 * 计算价格
 */
public class ProductInfo {
    public static Double getPrice() {
        return Math.random() * 200 ;
    }
}
