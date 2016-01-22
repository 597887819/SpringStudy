package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by wug on 2016/1/19 0019 16:21.
 * email wug@shinemo.com
 */
public class HelloWorldPostProcessor {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void init() {
        System.out.println("Bean is going through init.");
    }

    public void destroy() {
        System.out.println("Bean will destroy now.");
    }

    public static void run() {
        AbstractApplicationContext context = IocContainer.initBeansXml();
        HelloWorldPostProcessor obj = (HelloWorldPostProcessor)context.getBean("helloWorldPostProcessor");
        obj.getMessage();
        context.registerShutdownHook();
    }
}
