package com.tutorialspoint.aop.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wug on 2016/1/22 0022 15:18.
 * email wug@shinemo.com
 */
public class Student {
    private Integer age;
    private String name;

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        System.out.println("Age : " + age);
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Name : " + name);
        return name;
    }

    public void printThrowException() {
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }

    public static void run() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Student student = (Student)context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}
