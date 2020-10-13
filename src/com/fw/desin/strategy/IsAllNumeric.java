package com.fw.desin.strategy;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/24 23:34
 * @Description:
 */
public class IsAllNumeric implements ValidationStrategy{
    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}
