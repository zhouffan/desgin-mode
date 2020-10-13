package com.fw.desin.memento;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/29 21:19
 * @Description: 游戏
 * 我们还是用一个小例子来简单介绍一下备忘录模式，在玩一个步骤游戏时，
 * 每走一步时步数都加一，遇到道具可以快速走几步，或者减几步。用备忘录模式的思想来实现这个逻辑
 */
public class Game {
    /**
     * 玩家走的步数
     */
    private int playerStep;

    /**
     * 开始玩游戏
     */
    public void play(){
        playerStep = 0;
    }

    public int getPlayerStep() {
        return playerStep;
    }

    public void setPlayerStep(int playerStep) {
        this.playerStep = playerStep;
    }

    /**
     * 备份游戏
     * @return
     */
    public GameMemento createGameMemento(){
        return new GameMemento(playerStep);
    }

    /**
     * 恢复备份
     * @param gameMemento
     */
    public void restore(GameMemento gameMemento){
        this.playerStep = gameMemento.getPlayerSteps();
    }
}
