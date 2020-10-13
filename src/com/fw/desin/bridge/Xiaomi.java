package com.fw.desin.bridge;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/21 20:58
 * @Description:
 */
public class Xiaomi implements Brand {
    @Override
    public void open() {
        System.out.println("xiaomi open...");
    }

    @Override
    public void close() {
        System.out.println("xiaomi close...");
    }

    @Override
    public void call() {
        System.out.println("xiaomi call...");
    }
}
