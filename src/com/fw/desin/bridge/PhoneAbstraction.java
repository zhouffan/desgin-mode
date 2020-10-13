package com.fw.desin.bridge;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/21 20:55
 * @Description:  桥接-----充当abstraction, 与 brand及其具体的实现类 各司其职
 */
public class PhoneAbstraction {
    Brand brand;

    public PhoneAbstraction(Brand brand) {
        this.brand = brand;
    }

    public void open(){
        brand.open();
    }
    public void close(){
        brand.close();
    }
    public void call(){
        brand.call();
    }
}
