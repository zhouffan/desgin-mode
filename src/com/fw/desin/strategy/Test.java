package com.fw.desin.strategy;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/14 22:20
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Validator validator = new Validator(new IsAllLowerCase());
        System.out.println(validator.validate("aaaaa1"));
        Validator validator1 = new Validator(new IsAllNumeric());
        System.out.println(validator1.validate("232342"));
        //java 8
        Validator validator2 = new Validator(s -> s.matches("[A-Z]+"));
        System.out.println(validator2.validate("ADSFA"));

    }
}
