package com.fw.desin.memento;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/29 21:17
 * @Description: 备份信息管理类
 */
public class Caretaker {
    /**
     * 备份状态
     */
    private GameMemento gameMemento;

    /**
     * 保存备份状态
     * @param gameMemento
     */
    public void saveMemento(GameMemento gameMemento){
        this.gameMemento = gameMemento;
    }

    /**
     * 恢复备份
     * @return
     */
    public GameMemento restoreMemento(){
        return this.gameMemento;
    }

}
