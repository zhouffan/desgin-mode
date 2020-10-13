package com.fw.desin.builder.nondesign;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/19 22:02
 * @Description:  问题：把房子和创建房子的过程封装在一起，耦合性太强. 需要解耦
 */
public abstract class AbstractHouse {
    House house = new House();
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void buildRoofed();

    public House constructHouse(){
        buildBasic();
        buildWalls();
        buildRoofed();
        return house;
    }
}
