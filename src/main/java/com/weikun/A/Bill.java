package com.weikun.A;

/**
 * Created by Administrator on 2016/11/12.
 */
public class Bill implements Teacher {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println(this.name+"讲Spring！");
    }
}
