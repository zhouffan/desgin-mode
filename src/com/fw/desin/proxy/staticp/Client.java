package com.fw.desin.proxy.staticp;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/20 10:46
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDaoImpl();
        ITeacherDao daoProxy = new TeacherDaoProxy(teacherDao);
        daoProxy.teach();
        System.out.println("teacherDao = " + teacherDao);
        System.out.println("daoProxy = " + daoProxy);
    }
}
