package com.fw.desin.composite;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/22 23:01
 * @Description:
 */
public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void someOperation(String preStr) {
        System.out.println(preStr + "  -:" + name);
    }
}
