package com.fw.desin.strategy;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/24 23:35
 * @Description:
 */
public class Validator {
    private ValidationStrategy strategy;

    public Validator(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String s){
        return strategy.execute(s);
    }
}
