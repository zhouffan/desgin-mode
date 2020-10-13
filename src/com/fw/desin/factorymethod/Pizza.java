package com.fw.desin.factorymethod;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/19 20:36
 * @Description:
 */
public abstract class Pizza {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();
    public void bake(){
        System.out.println(name + "bake");
    }
    public void cut(){
        System.out.println(name + "cut");
    }
    public void box(){
        System.out.println(name + "box");
    }

    public void create(){
        prepare();
        bake();
        cut();
        box();
    }
}
