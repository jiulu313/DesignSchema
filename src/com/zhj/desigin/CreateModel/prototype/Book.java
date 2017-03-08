package com.zhj.desigin.CreateModel.prototype;

/**
 * Created by zhanghongjun on 16/10/18.
 *
 */
public class Book implements Cloneable{
    private String name;
    private int price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name="+name+" price="+price;
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }
}
