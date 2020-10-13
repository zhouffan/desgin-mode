package com.fw.desin.template;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/24 23:02
 * @Description:
 */
public abstract class Template {
    private void order(){
        System.out.println("下单");
    }

    abstract void eatFood();

    private void payMoney(){
        System.out.println("付钱");
    }

    protected void evaluate(){
        System.out.println("评价");
    }

    boolean canEvaluate(){
        return true;
    }
    /**
     * 模板方法，final修饰的方法，不可以被子类重写
     */
    public final void process(){
        this.order();
        this.eatFood();
        this.payMoney();
        if (canEvaluate()) {
            this.evaluate();
        }
    }
}
