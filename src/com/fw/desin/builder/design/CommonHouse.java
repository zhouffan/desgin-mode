package com.fw.desin.builder.design;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/19 22:11
 * @Description:
 */
public class CommonHouse extends HouseBuilder{
    private House house;
    public CommonHouse(){
        house = getHouse();
    }
    @Override
    public void buildBasic() {
        house.setBaise("common  basic地基5米");
    }

    @Override
    public void buildWalls() {
        house.setWall("common  walls 墙厚10cm");
    }

    @Override
    public void buildRoofed() {
        house.setRoofed("common  roofed 封顶5m");
    }
}
