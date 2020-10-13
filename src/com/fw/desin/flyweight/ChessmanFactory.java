package com.fw.desin.flyweight;

import java.util.Hashtable;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/22 21:50
 * @Description: 享元工厂类   原理：利用集合缓存其使用到的元素，再次使用时，从集合拿出
 */
public class ChessmanFactory {

    /**
     * 单例
     */
    private static ChessmanFactory chessmanFactory = new ChessmanFactory();
    private final Hashtable<Character, AbstractChessman> cache = new Hashtable<>();
    /**
     * 私有
     */
    private ChessmanFactory(){
    }
    public static ChessmanFactory getInstance(){
        return chessmanFactory;
    }

    public AbstractChessman getChessmanObject(char c){
        AbstractChessman chessman = cache.get(c);
        if (chessman == null) {
            switch (c) {
                case 'B':
                    chessman = new BlackChessman();
                    break;
                case 'W':
                    chessman = new WhiteChessman();
                    break;
                default:
                    break;
            }
            if (chessman != null) {
                cache.put(c, chessman);
            }
        }
        return chessman;
    }
}
