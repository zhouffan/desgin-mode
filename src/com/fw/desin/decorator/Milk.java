package com.fw.desin.decorator;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/21 21:51
 * @Description:
 */
public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDescription("milk...");
        setPrice(0.5f);
    }
}
