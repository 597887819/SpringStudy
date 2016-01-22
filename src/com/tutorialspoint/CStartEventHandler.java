package com.tutorialspoint;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by wug on 2016/1/22 0022 11:12.
 * email wug@shinemo.com
 */
public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("ContextStartedEvent Received");
    }

    public static void run() {
        AbstractApplicationContext context = IocContainer.initBeansXml();
        context.start();
        HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
        obj.getMessage();
        context.refresh();
        context.stop();
        context.close();
    }
}
