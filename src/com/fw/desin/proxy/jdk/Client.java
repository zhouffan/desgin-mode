package com.fw.desin.proxy.jdk;


/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/20 10:46
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDaoImpl();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        ITeacherDao proxyInstance = proxyFactory.getProxyInstance();
        proxyInstance.teach();
        proxyInstance.teach2();
        System.out.println("teacherDao = " + teacherDao.getClass());
        System.out.println("proxyInstance = " + proxyInstance.getClass());
    }
}
