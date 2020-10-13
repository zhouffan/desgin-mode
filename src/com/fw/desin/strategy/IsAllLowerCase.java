package com.fw.desin.strategy;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/24 23:32
 * @Description: 是否是a-z小写字母
 */
public class IsAllLowerCase implements ValidationStrategy{
    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
