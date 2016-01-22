package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;

/**
 * Created by wug on 2016/1/21 0021 10:54.
 * email wug@shinemo.com
 */
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    /**
     * @Require 注释应用于 bean 属性的 setter 方法，
     * 它表明受影响的 bean 属性在配置时必须放在 XML 配置文件中，
     * 否则容器就会抛出一个 BeanInitializationException 异常。
     * @param name
     */
    @Required
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Required
    public void setAge(int age) {
        this.age = age;
    }

    public static void run() {
        ApplicationContext context = IocContainer.initBeansXml1();
        Student student = (Student)context.getBean("student");
        System.out.println("Name : " + student.getName() );
        System.out.println("Age : " + student.getAge() );
    }
}
