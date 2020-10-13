package com.fw.desin.adapter;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/21 20:18
 * @Description:
 */
public class Phone {
    public void charging(Voltage5V voltage5V){
        if(voltage5V.output() == 5){
            System.out.println("电压稳定，进行充电...");
            return;
        }
        System.out.println("电压不稳，不能进行充电");
    }
}
