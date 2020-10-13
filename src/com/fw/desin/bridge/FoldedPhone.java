package com.fw.desin.bridge;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/21 21:09
 * @Description:
 */
public class FoldedPhone extends PhoneAbstraction{
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.println("折叠手机...");
        super.open();
    }

    @Override
    public void close() {
        System.out.println("折叠手机...");
        super.close();
    }

    @Override
    public void call() {
        System.out.println("折叠手机...");
        super.call();
    }
}
