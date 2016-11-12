package com.weikun.B;

/**
 * Created by Administrator on 2016/11/12.
 */
public class People {
    private String name;
    private String sex;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public People(){

    }

    public People(String name, String sex) {
        this.name = name;
        this.sex = sex;

    }

    public People(String name, String sex,int age) {
        this.name = name;
        this.sex = sex;
        this.age=age;

    }

    public People(String name, String sex,String address) {
        this.name = name;
        this.sex = sex;
        this.address=address;

    }


    public People(String name, String sex, int age, String address,Office office) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.office=office;
    }

    @Override
    public String toString() {
        return name+":"+sex+":"+age+":"+address+this.office.getOld();
    }
    private Office office;

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
}
class Office{
    private int old;

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }
}
