package com.weikun.A;

/**
 * Created by Administrator on 2016/11/12.
 */
public class JavaTrad {

    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void teaching(){
        this.teacher.say();
    }
}
