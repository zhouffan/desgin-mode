package com.fw.desin.chain;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/28 22:18
 * @Description:
 */
public class DebugLogger extends AbstractLogger{
    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("DebugLogger====>" + message);
    }
}
