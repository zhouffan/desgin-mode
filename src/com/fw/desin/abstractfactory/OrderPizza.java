package com.fw.desin.abstractfactory;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/19 21:47
 * @Description:
 */
public class OrderPizza {
    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }

    public void setAbsFactory(AbsFactory absFactory) {
        this.absFactory = absFactory;
        String orderType = "cheese";
        Pizza pizza = absFactory.createPizza(orderType);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
}
