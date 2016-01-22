package com.tutorialspoint;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by wug on 2016/1/22 0022 11:45.
 * email wug@shinemo.com
 */

/**
 * 一旦定义事件类，你可以从任何类中发布它，
 * 假定 EventClassPublisher 实现了 ApplicationEventPublisherAware。
 * 你还需要在 XML 配置文件中声明这个类作为一个 bean，
 * 之所以容器可以识别 bean 作为事件发布者，是因为它实现了 ApplicationEventPublisherAware 接口。
 */
public class CustomerEventPublisher implements ApplicationEventPublisherAware {
    /**
     * 3、声明 ApplicationEventPublisher
     */
    private static ApplicationEventPublisher publisher;

    /**
     * 4、重写setApplicationEventPublisher方法
     */
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher =  publisher;
    }

    /**
     * 5、通过ApplicationEventPublisherAware的实现类发布事件
     */
    public void publish() {
        publisher.publishEvent(new CustomerEvent(this));
    }
}
