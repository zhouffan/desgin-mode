package com.fw.desin.decorator;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/21 21:43
 * @Description:
 */
public class Coffee extends Drink{
    @Override
    float cost() {
        return getPrice();
    }
}
