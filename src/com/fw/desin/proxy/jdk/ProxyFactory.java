package com.fw.desin.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/20 10:56
 * @Description:  静态和动态 都需要持有被代理对象， 然后调用其方法，进行扩展处理
 */
public class ProxyFactory {
    private ITeacherDao teacherDao;

    public ProxyFactory(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public ITeacherDao getProxyInstance(){
//        ClassLoader loader 指定目标对象的类加载器，获取加载器的方法固定
//        Class<?>[] interfaces:目标对象实现的接口类型，使用泛型方法确认类型
//        InvocationHandler :事情处理，执行目标对象的方法时，会触发事情处理器方法
        return (ITeacherDao) Proxy.newProxyInstance(teacherDao.getClass().getClassLoader(),
                teacherDao.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理扩展功能1...");
                        Object invoke = method.invoke(teacherDao, args);
                        System.out.println("代理扩展功能2...");
                        return invoke;
                    }
                });
    }
}
