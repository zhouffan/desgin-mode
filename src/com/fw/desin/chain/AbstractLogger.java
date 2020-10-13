package com.fw.desin.chain;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/28 22:12
 * @Description:
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    /**
     * 当前级别
     */
    protected int level;
    /**
     * 下个元素
     */
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    /**
     * 打印
     * @param level 上一个级别
     * @param message 消息
     */
    public void logMessage(int level, String message){
        if (this.level <= level){
            write(message);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 具体操作
     * @param message
     */
    abstract protected void write(String message);
}
