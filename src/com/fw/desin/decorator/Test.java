package com.fw.desin.decorator;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/14 22:20
 * @Description: inputStream 类似
 */
public class Test {
    public static void main(String[] args) {
        Drink shortBlack = new ShortBlack();
        System.out.println("shortBlack.cost() = " + shortBlack.cost());

        Drink drink = new Milk(shortBlack);
        System.out.println("drink.cost() = " + drink.cost());
    }
}
