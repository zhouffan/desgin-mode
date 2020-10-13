package com.fw.desin.prototype;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/18 22:48
 * @Description:
 */
public class SheepQ implements Cloneable{
    private Head head;
    private String name;

    public SheepQ(Head head, String name) {
        this.head = head;
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public String getName() {
        return name;
    }

    /**
     * 浅拷贝----基础数据类型会复制。但是引用类型复制后是同一个指向（复制得是内存地址）
     * 所以如果还有引用类型，引用类型也需要重写
     * @return
     */
    @Override
    protected Object clone(){
        SheepQ sheep = null;
        try {
            sheep = (SheepQ) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
