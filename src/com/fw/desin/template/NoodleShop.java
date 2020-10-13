package com.fw.desin.template;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/24 23:04
 * @Description: 具体模板角色(面馆)
 */
public class NoodleShop extends Template{
    @Override
    void eatFood() {
        System.out.println("面馆吃面");
    }

    @Override
    boolean canEvaluate() {
        return false;
    }
}
