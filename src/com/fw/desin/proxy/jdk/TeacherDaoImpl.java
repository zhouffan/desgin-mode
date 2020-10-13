package com.fw.desin.proxy.jdk;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/20 10:55
 * @Description:
 */
public class TeacherDaoImpl implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("real teach...");
    }

    @Override
    public void teach2() {
        System.out.println("real teach2...");
    }
}
