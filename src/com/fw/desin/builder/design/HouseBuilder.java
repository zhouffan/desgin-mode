package com.fw.desin.builder.design;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/19 22:09
 * @Description:
 */
public abstract class HouseBuilder {
    private House house = new House();

    public House getHouse() {
        return house;
    }

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void buildRoofed();
}
