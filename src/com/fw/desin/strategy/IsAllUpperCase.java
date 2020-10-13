package com.fw.desin.strategy;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/24 23:33
 * @Description:
 */
public class IsAllUpperCase implements ValidationStrategy{
    @Override
    public boolean execute(String s) {
        return s.matches("[A-Z]+");
    }
}
