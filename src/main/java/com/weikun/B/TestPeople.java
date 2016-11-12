package com.weikun.B;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/11/12.
 */
public class TestPeople {
    @Test
    public void go(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("my/bean1.xml");
        People p=(People)ctx.getBean("people4");
        System.out.print(p);

    }
}
