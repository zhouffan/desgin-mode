package com.fw.desin.factorymethod;


/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/19 21:11
 * @Description:
 */
public class BJOrderPizzaFactory extends AbsOrderPizzaFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType){
            case "cheese":
                pizza = new BJCheessPizza();
                break;
            case "pepper":
                pizza = new BJPepperPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
