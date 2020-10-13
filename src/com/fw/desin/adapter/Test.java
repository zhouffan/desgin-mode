package com.fw.desin.adapter;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/21 20:27
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
//        Phone phone = new Phone();
//        Voltage5V v = new VoltageAdapter();
//        phone.charging(v);


        Phone phone = new Phone();
        Voltage5V v = new VoltageAdapter2(new Voltage220V());
        phone.charging(v);
    }
}
