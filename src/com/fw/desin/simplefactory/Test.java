package com.fw.desin.simplefactory;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/14 22:20
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Pizza cheese = SimpleFactory.createPizza("cheese");
        cheese.create();
    }
}
