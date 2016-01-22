package com.tutorialspoint;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by wug on 2016/1/19 0019 11:05.
 * email wug@shinemo.com
 */
public class IocContainer {
    /**
     *  Spring 容器是 Spring 框架的核心。容器将创建对象，把它们连接在一起，配置它们，并管理他们的整个生命周期从创建到销毁。
     *  ApplicationContext 容器包括 BeanFactory 容器的所有功能，所以通常建议超过 BeanFactory。
     *  BeanFactory 仍然可以用于轻量级的应用程序，如移动设备或基于 applet 的应用程序，其中它的数据量和速度是显著。
     */
    static void initBeans() {
        /**
         *  ClassPathXmlApplicationContext 容器
         *  该容器从 XML 文件中加载已被定义的 bean。
         *  在这里，你不需要提供 XML 文件的完整路径，只需正确配置 CLASSPATH 环境变量即可，
         *  因为，容器会从 CLASSPATH 中搜索 bean 配置文件。
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
        /**
         * XmlBeanFactory 容器
         * 这个容器从一个 XML 文件中读取配置元数据，由这些元数据来生成一个被配置化的系统或者应用。
         */
        /*
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        HelloWorld obj = (HelloWorld)factory.getBean("helloWorld");
        */
        /**
         * FileSystemXmlApplicationContext 容器
         * 该容器从 XML 文件中加载已被定义的 bean。在这里，你需要提供给构造器 XML 文件的完整路径
         */
        /*
        ApplicationContext context = new FileSystemXmlApplicationContext("D:/Idea14Work/HelloSpring/src/Beans.xml");
        HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
        */
        obj.getMessage();
    }

    static ApplicationContext initBeansXml1() {
        return initBeansXml();
    }

    static AbstractApplicationContext initBeansXml() {
        return new ClassPathXmlApplicationContext("Beans.xml");
    }
}
