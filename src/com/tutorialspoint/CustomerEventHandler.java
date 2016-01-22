package com.tutorialspoint;

import org.springframework.context.ApplicationListener;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by wug on 2016/1/22 0022 11:55.
 * email wug@shinemo.com
 */
public class CustomerEventHandler implements ApplicationListener<CustomerEvent> {
    @Override
    public void onApplicationEvent(CustomerEvent event) {
        System.out.println("CustomerEvent Received");
    }

    public static void run() {
        AbstractApplicationContext context = IocContainer.initBeansXml();
        CustomerEventPublisher publisher = (CustomerEventPublisher)context.getBean("customerEventPublisher");
        publisher.publish();
        publisher.publish();
    }
}

