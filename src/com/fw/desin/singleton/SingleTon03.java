package com.fw.desin.singleton;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/18 22:22
 * @Description: 懒汉式-线程安全，同步方法
 *
 */
public class SingleTon03 {
    private SingleTon03(){}

    private static SingleTon03 singleTon;

    /**
     * 效率低，每个线程项获得实例时，要在该方法同步
     * @return
     */
    public static synchronized SingleTon03 getInstance(){
        if(singleTon == null){
            singleTon = new SingleTon03();
        }
        return singleTon;
    }
}
