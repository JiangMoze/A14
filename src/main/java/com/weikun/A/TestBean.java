package com.weikun.A;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by Administrator on 2016/11/12.
 */
public class TestBean {
    @Test
    public void practice1() {
        Resource res=new ClassPathResource("beans.xml");
        BeanFactory bf=new XmlBeanFactory(res);
        Car c=(Car)bf.getBean("car");
        System.out.println(c);

    }
    @Test
    public void practice2() {
//        Resource res=new ClassPathResource("beans.xml");
//        BeanFactory bf=new XmlBeanFactory(res);

        //ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        //在项目的根下找文件
        ApplicationContext ctx=new FileSystemXmlApplicationContext("classpath:beans.xml");


        JavaTrad js=(JavaTrad)ctx.getBean("java");
        js.teaching();
    }
}
