package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by wug on 2016/1/19 0019 17:11.
 * email wug@shinemo.com
 */
public class HelloIndia {
    private String message1;
    private String message2;
    private String message3;

    public void setMessage1(String message) {
        this.message1 = message;
    }

    public void setMessage2(String message) {
        this.message2 = message;
    }

    public void setMessage3(String message) {
        this.message3 = message;
    }

    public void getMessage1() {
        System.out.println("India Message1 : " + message1);
    }

    public void getMessage2() {
        System.out.println("India Message2 : " + message2);
    }

    public void getMessage3() {
        System.out.println("India Message3 : " + message3);
    }

    public static void run() {
        AbstractApplicationContext context = IocContainer.initBeansXml();
        /**
         * spring 配置文件中声明该bean为 abstract 无法实例化
         */
        /*
        BeanTemplate beanTemplate = (BeanTemplate)context.getBean("beanTemplate");
        beanTemplate.getMessage1();
        beanTemplate.getMessage2();
        */
        HelloIndia helloIndia = (HelloIndia)context.getBean("helloIndia");
        helloIndia.getMessage1();
        helloIndia.getMessage2();
        helloIndia.getMessage3();
    }
}
