package com.fw.desin.abstractfactory;

import com.fw.desin.factorymethod.BJOrderPizzaFactory;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/14 22:20
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        OrderPizza orderPizza  = new OrderPizza(new BJFactory());
    }
}
