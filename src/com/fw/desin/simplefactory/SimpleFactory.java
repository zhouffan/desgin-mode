package com.fw.desin.simplefactory;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/19 20:47
 * @Description:
 */
public class SimpleFactory {
    public static Pizza createPizza(String type){
        Pizza pizza = null;
        switch (type){
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
        }

        return pizza;
    }
}
