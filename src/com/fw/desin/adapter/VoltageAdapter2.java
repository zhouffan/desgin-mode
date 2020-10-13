package com.fw.desin.adapter;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/21 20:20
 * @Description:  对象适配器模式：尽可能使用 聚合/组合，满足"合成复用原则"
 *
 * 解决必须继承src的局限性
 */
public class VoltageAdapter2 implements Voltage5V{
    Voltage220V voltage220V;

    public VoltageAdapter2(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output() {
        //转成5v
        return voltage220V.output220V()/44;
    }
    //里氏替换原则，不要随意去修改父类的方法
//    @Override
//    public int output220V() {
//        //转成5v
//        return super.output220V()/44;
//    }

}
