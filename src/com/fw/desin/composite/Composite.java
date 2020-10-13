package com.fw.desin.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/22 22:34
 * @Description: 组合类
 */
public class Composite extends Component{
    private List<Component> childComponents = null;
    public Composite(String name) {
        super(name);
    }

    @Override
    public void someOperation(String preStr) {
        //输出当前节点数据
        System.out.println(preStr + "+"+name);
        //输出子节点内容
        if (childComponents != null) {
            for (Component component : childComponents) {
                //递归进行子组件对应的方法
                component.someOperation(" "+preStr);
            }
        }
    }

    @Override
    public void addChild(Component child) {
        if (childComponents == null) {
            childComponents = new ArrayList<>();
        }
        childComponents.add(child);
    }

    @Override
    public void removeChild(Component child) {
        if (childComponents != null && child != null) {
            childComponents.remove(child);
        }
    }

    @Override
    public void getChild(int index) {
        if (childComponents != null) {
            childComponents.get(index);
        }
    }
}
