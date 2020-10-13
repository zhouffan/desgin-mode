package com.fw.desin.chain;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/14 22:20
 * @Description:
 */
public class Test {
    public static AbstractLogger getChain() {
        AbstractLogger info = new InfoLogger(AbstractLogger.INFO);
        AbstractLogger debug = new InfoLogger(AbstractLogger.DEBUG);
        AbstractLogger error = new InfoLogger(AbstractLogger.ERROR);
        error.setNextLogger(debug);
        debug.setNextLogger(info);
        return error;
    }
    public static void main(String[] args) {
        AbstractLogger chain = getChain();
//        chain.logMessage(AbstractLogger.INFO, "this is info");
        chain.logMessage(AbstractLogger.DEBUG, "this is debug");
    }
}
