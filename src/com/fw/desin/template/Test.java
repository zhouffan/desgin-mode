package com.fw.desin.template;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/14 22:20
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Template eatNoodle = new NoodleShop();
        eatNoodle.process();
        System.out.println("===================");
        Template eatBarbecue = new BarbecueShop();
        eatBarbecue.process();
        System.out.println("===================");
        Template noodle = new Template() {
            @Override
            void eatFood() {
                System.out.println("吃羊肉");
            }
        };
        noodle.process();
    }
}
