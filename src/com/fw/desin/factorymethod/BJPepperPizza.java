package com.fw.desin.factorymethod;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/19 21:02
 * @Description:
 */
public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("bj-pepper");
        System.out.println(getName() + "  preparing");
    }
}
