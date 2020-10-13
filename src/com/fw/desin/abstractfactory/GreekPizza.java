package com.fw.desin.abstractfactory;


import com.fw.desin.factorymethod.Pizza;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/19 20:38
 * @Description:
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("greek...");
        System.out.println(getName() + " preparing...");
    }
}
