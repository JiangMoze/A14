package com.weikun.A;

/**
 * Created by Administrator on 2016/11/12.
 */
public class Car {
    private int age;
    private String name;
    private float price;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void init(){

        System.out.println("ok init");
    }
    public void mydestroy(){
        System.out.println("ok destroy");
    }
    @Override
    public String toString() {
        return name+age+price;
    }
}
