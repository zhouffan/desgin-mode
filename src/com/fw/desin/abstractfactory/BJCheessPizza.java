package com.fw.desin.abstractfactory;


/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/19 21:02
 * @Description:
 */
public class BJCheessPizza extends Pizza{
    @Override
    public void prepare() {
        setName("bj-cheess");
        System.out.println(getName() + "  preparing");
    }
}
