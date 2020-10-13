package com.fw.desin.adapter;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/21 20:20
 * @Description:  类适配器模式：继承。但是尽可能使用 聚合/组合，满足"合成复用原则"
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int output() {
        //转成5v
        return output220V()/44;
    }
    //里氏替换原则，不要随意去修改父类的方法
//    @Override
//    public int output220V() {
//        //转成5v
//        return super.output220V()/44;
//    }

}
