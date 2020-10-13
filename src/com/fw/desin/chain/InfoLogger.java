package com.fw.desin.chain;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/28 22:18
 * @Description:
 */
public class InfoLogger extends AbstractLogger{
    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("InfoLogger====>" + message);
    }
}
