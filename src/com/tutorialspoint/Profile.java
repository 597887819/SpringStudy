package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;

/**
 * Created by wug on 2016/1/21 0021 14:46.
 * email wug@shinemo.com
 */
public class Profile {
    @Autowired
    @Qualifier(value = "student1")
    private Student student;

    public Profile(){
        System.out.println("Inside Profile constructor." );
    }

    public void printAge() {
        System.out.println("Age : " + student.getAge() );
    }

    public void printName() {
        System.out.println("Name : " + student.getName() );
    }

    public static void run() {
        ApplicationContext context = IocContainer.initBeansXml1();
        Profile profile = (Profile)context.getBean("profile");
        profile.printAge();
        profile.printName();
    }
}
