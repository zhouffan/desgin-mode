package com.fw.desin.decorator;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/21 21:41
 * @Description: 咖啡种类 或者 调料。 都各自有不同的价格和描述
 */
public abstract class Drink {
    String description;
    float price = 0.0f;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    abstract float cost();
}
