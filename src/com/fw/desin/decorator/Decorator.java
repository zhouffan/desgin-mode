package com.fw.desin.decorator;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/21 21:46
 * @Description: 装饰类
 */
public class Decorator extends Drink{
    /**
     * 被装饰者
     */
    Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    float cost() {
        //自身+持有
        return getPrice() + drink.price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "&&" + drink.getDescription();
    }
}
