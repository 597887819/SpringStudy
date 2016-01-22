package com.tutorialspoint;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by wug on 2016/1/19 0019 14:15.
 * email wug@shinemo.com
 */
public class InitAndDestroyByImpl implements InitializingBean, DisposableBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    /**
     * 初始化时执行
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is going through init.");
    }

    /**
     * 销毁时执行
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean will destroy now.");
    }

    public static void run() {
        AbstractApplicationContext context = IocContainer.initBeansXml();
        InitAndDestroyByImpl obj = (InitAndDestroyByImpl)context.getBean("initAndDestroyByImpl");
        obj.getMessage();
        context.registerShutdownHook();
    }
}
