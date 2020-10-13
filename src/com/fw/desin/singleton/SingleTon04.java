package com.fw.desin.singleton;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/18 22:22
 * @Description: 双重检查
 *
 */
public class SingleTon04 {
    private SingleTon04(){}

    /**
     * volatile： 让修改值立即更新到储存, 防止指令重排序, 变量值共享
     * 保证第一个线程创建的立即让另一个线程知道
     */
    private static volatile SingleTon04 singleTon;

    /**
     * 效率低，每个线程项获得实例时，要在该方法同步
     * @return
     */
    public static synchronized SingleTon04 getInstance(){
        if(singleTon == null){
            synchronized (SingleTon04.class){
                if(singleTon == null){
                    singleTon = new SingleTon04();
                }
            }
        }
        return singleTon;
    }
}
