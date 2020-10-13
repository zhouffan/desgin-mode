package com.fw.desin.flyweight;

import java.util.Random;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/14 22:20
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ChessmanFactory factory = ChessmanFactory.getInstance();
        Random random = new Random();
        AbstractChessman chessman = null;
        for (int i = 0; i < 10; i++){
            switch (i % 2){
                case 0:
                    chessman = factory.getChessmanObject('B');
                    break;
                case 1:
                    chessman = factory.getChessmanObject('W');
                    break;
                default:
                    break;
            }
            if (chessman != null) {
                chessman.point(random.nextInt(5), random.nextInt(10));
            }
        }
    }
}
