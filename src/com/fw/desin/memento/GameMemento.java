package com.fw.desin.memento;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/29 21:14
 * @Description: 备份
 * 我们还是用一个小例子来简单介绍一下备忘录模式，在玩一个步骤游戏时，
 * 每走一步时步数都加一，遇到道具可以快速走几步，或者减几步。用备忘录模式的思想来实现这个逻辑
 */
public class GameMemento {
    /**
     * 步数
     */
    private int playerSteps;

    /**
     * 备份步数
     * @param playerSteps
     */
    public GameMemento(int playerSteps) {
        this.playerSteps = playerSteps;
    }

    public int getPlayerSteps() {
        return playerSteps;
    }
}
