package com.fw.desin.proxy.staticp;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/20 10:44
 * @Description:
 */
public class TeacherDaoImpl implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("real teacher teach....");
    }
}
