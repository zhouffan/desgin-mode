package com.fw.desin.singleton;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/18 22:22
 * @Description: 静态内部类--懒加载，线程安全
 *
 */
public class SingleTon05 {
    private SingleTon05(){}
    private static class SingletonInstance{
        private static final SingleTon05 instance = new SingleTon05();
    }

    /**
     * 1.singleton类装载时， singletonInstance 不会装载
     * 2.用到getInstance时会装载singletonInstance， 类装载时是线程安全的 —-懒加载，线程安全
     * @return
     */
    public static synchronized SingleTon05 getInstance(){
        return SingletonInstance.instance;
    }
}
