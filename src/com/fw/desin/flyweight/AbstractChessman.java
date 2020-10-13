package com.fw.desin.flyweight;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/22 21:43
 * @Description: 抽象 棋子类
 */
public abstract class AbstractChessman {
    protected int x;
    protected int y;
    protected String chess;

    public AbstractChessman(String chess) {
        this.chess = chess;
    }

    public void show(){
        System.out.println(chess + ":" + x + "-"+y);
    }

    public void point(int x, int y){
        this.x = x;
        this.y = y;
        show();
    }
}
