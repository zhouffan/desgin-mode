package com.fw.desin.proxy.staticp;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/20 10:45
 * @Description:
 */
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao teacherDao;

    public TeacherDaoProxy(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("teach 加强1...");
        teacherDao.teach();
        System.out.println("teach 加强2...");
    }
}
