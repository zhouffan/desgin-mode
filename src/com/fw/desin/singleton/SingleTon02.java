package com.fw.desin.singleton;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/18 22:22
 * @Description: 懒汉式， 使用时创建. 线程不安全
 *
 */
public class SingleTon02 {
    private SingleTon02(){}

    private static SingleTon02 singleTon;

    public static SingleTon02 getInstance(){
        if(singleTon == null){
            singleTon = new SingleTon02();
        }
        return singleTon;
    }
}
