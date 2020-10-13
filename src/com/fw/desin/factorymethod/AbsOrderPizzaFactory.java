package com.fw.desin.factorymethod;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/19 21:05
 * @Description: 核心： 将实例化功能抽象成方法， 不同口味由不同子类实现
 */
public abstract class AbsOrderPizzaFactory {
    /**
     * 定义一个抽象方法，让各个工厂子类实现
     * @param orderType
     * @return
     */
    public abstract Pizza createPizza(String orderType);
    public AbsOrderPizzaFactory(){
        Pizza pizza = null;
        //输入
        String orderType = "cheese";
        pizza = createPizza(orderType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
