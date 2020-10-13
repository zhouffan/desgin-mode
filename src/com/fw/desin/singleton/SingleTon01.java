package com.fw.desin.singleton;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/18 22:22
 * @Description: 饿汉式，静态常量。
 * 类装载时完成实例化。 没有lazy loading效果，所以可能造成内存浪费
 *
 */
public class SingleTon01 {
    private SingleTon01(){}

    private static SingleTon01 singleTon01 = new SingleTon01();

    //静态代码块创建
//    static {
//        singleTon01 = new SingleTon01();
//    }

    public static SingleTon01 getInstance(){
        return singleTon01;
    }
}
