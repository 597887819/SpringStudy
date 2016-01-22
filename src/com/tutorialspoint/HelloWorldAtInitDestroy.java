package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by wug on 2016/1/21 0021 16:51.
 * email wug@shinemo.com
 */
public class HelloWorldAtInitDestroy {
    private String message;

    /**
     *  @PostConstruct 注释作为初始化回调函数的一个替代
     */
    @PostConstruct
    public void init(){
        System.out.println("Bean is going through init.");
    }

    /**
     * @PreDestroy 注释作为销毁回调函数的一个替代
     */
    @PreDestroy
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }

    public static void run() {
        AbstractApplicationContext context = IocContainer.initBeansXml();
        HelloWorldAtInitDestroy obj = (HelloWorldAtInitDestroy)context.getBean("helloWorldAtInitDestroy");
        context.registerShutdownHook();
    }
}
