package com.fw.desin.bridge;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/14 22:20
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new Xiaomi());
        foldedPhone.open();
    }
}
