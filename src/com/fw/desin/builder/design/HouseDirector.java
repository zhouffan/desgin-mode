package com.fw.desin.builder.design;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/19 22:14
 * @Description: 持有builder 对象， 具体怎么建造由这里决定。
 * */
public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 具体建造房子步骤
     * @return
     */
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.buildRoofed();
        return houseBuilder.getHouse();
    }
}
