package com.tutorialspoint;

import org.springframework.context.ApplicationEvent;

/**
 * Created by wug on 2016/1/22 0022 11:41.
 * email wug@shinemo.com
 */

/**
 * 1、继承ApplicationEvent
 */
public class CustomerEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    /**
     *  必须定义一个默认的构造函数，它应该从 ApplicationEvent 类中继承的构造函数。
     * @param source
     */
    public CustomerEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "My Customer Event";
    }
}
