package com.fw.desin.factorymethod;


/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/19 20:38
 * @Description:
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("cheese...");
        System.out.println(getName() + " preparing...");
    }
}
