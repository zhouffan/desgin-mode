package com.fw.desin.builder.design;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/19 22:11
 * @Description:
 */
public class HighHouse extends HouseBuilder{
    private House house;
    public HighHouse(){
        house = getHouse();
    }
    @Override
    public void buildBasic() {
        house.setBaise("High  basic地基15米");
    }

    @Override
    public void buildWalls() {
        house.setWall("High  walls 墙厚20cm");
    }

    @Override
    public void buildRoofed() {
        house.setRoofed("High  roofed 封顶52m");
    }
}
