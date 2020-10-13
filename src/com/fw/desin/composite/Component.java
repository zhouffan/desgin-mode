package com.fw.desin.composite;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/22 22:28
 * @Description:
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * 示意方法，子组建对象可能有的功能方法
     * @param preStr
     */
    public abstract void someOperation(String preStr);

    /**
     * add
     * @param child
     */
    public void addChild(Component child){
        //缺省的实现，抛出异常，因为叶子对象没有这个功能
        throw new UnsupportedOperationException("对象不支持此功能");
    }
    public void removeChild(Component child){
        throw new UnsupportedOperationException("对象不支持此功能");
    }
    public void getChild(int index){
        throw new UnsupportedOperationException("对象不支持此功能");
    }
}
