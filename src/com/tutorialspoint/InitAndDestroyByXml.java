package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by wug on 2016/1/19 0019 14:40.
 * email wug@shinemo.com
 */
public class InitAndDestroyByXml {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void init() {
        System.out.println("Bean is going through init by XML.");
    }

    public void destroy() throws Exception {
        System.out.println("Bean will destroy now by XML.");
    }

    public static void run() {
        AbstractApplicationContext context = IocContainer.initBeansXml();
        InitAndDestroyByXml obj = (InitAndDestroyByXml)context.getBean("initAndDestroyByXml");
        obj.getMessage();
        context.registerShutdownHook();
    }
}
