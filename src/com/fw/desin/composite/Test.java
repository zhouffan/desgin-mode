package com.fw.desin.composite;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/14 22:20
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        //根
        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2 = new Composite("女装");
        Component c3 = new Composite("母婴");
        //定义多个leaf 和叶子对象
        Component leaf1 = new Leaf("西服");
        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("衬衫");
        Component leaf4 = new Leaf("裙子");
        Component leaf5 = new Leaf("鞋袜");
        Component leaf6 = new Leaf("孕妇装");
        Component leaf7 = new Leaf("婴儿装");
        //组合成树形结构
        root.addChild(c1);
        root.addChild(c2);
        root.addChild(c3);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c1.addChild(leaf3);
        c1.addChild(leaf5);

        c2.addChild(leaf1);
        c2.addChild(leaf2);
        c2.addChild(leaf3);
        c2.addChild(leaf4);
        c2.addChild(leaf5);

        c3.addChild(leaf6);
        c3.addChild(leaf7);

        root.someOperation("");
    }
}
