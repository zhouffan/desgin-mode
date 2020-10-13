package com.fw.desin.memento;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/14 22:20
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("开始游戏，前进10步");
        game.setPlayerStep(10);
        System.out.println("备份当前状态===>(备份内容是储存在Caretaker，恢复时也从其中取出恢复)");
        GameMemento gameMemento = game.createGameMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.saveMemento(gameMemento);
        System.out.println("备份完成");
        game.play();
        System.out.println("踩到便便，当前步数："+game.getPlayerStep());
        System.out.println("还原到上一步");
        game.restore(caretaker.restoreMemento());
        System.out.println("恢复： 步数："+game.getPlayerStep());
    }
}
