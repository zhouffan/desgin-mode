package com.fw.desin.prototype;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/18 22:48
 * @Description:
 */
public class SheepDeep implements Cloneable{
    private Head head;
    private String name;

    public SheepDeep(Head head, String name) {
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
        SheepDeep sheepDeep = null;
        try {
            sheepDeep = (SheepDeep) super.clone();
            sheepDeep.head = (Head) head.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheepDeep;
    }

}
