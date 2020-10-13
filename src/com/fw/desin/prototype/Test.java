package com.fw.desin.prototype;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/14 22:20
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
//        SheepQ sheep1 = new SheepQ(new Head("tou"),"tom");
//        SheepQ sheep2 = (SheepQ) sheep1.clone();
//
//        System.out.println(sheep1 + "  " + sheep1.getHead());
//        System.out.println(sheep2 + "  " + sheep2.getHead());
        //--------------------------------

//        SheepDeep sheepDeep1 = new SheepDeep(new Head("tou"),"tom");
//        SheepDeep sheepDeep2 = (SheepDeep) sheepDeep1.clone();
//
//        System.out.println(sheepDeep1 + "  " + sheepDeep1.getHead());
//        System.out.println(sheepDeep2 + "  " + sheepDeep2.getHead());

        SheepDeepRecommend sheepDeep1 = new SheepDeepRecommend(new Head("tou"),"tom");
        SheepDeepRecommend sheepDeep2 = (SheepDeepRecommend) sheepDeep1.deepClone();

        System.out.println(sheepDeep1 + "  " + sheepDeep1.getHead());
        System.out.println(sheepDeep2 + "  " + sheepDeep2.getHead());
    }
}
