package com.tutorialspoint;

/**
 * Created by wug on 2016/1/21 0021 17:49.
 * email wug@shinemo.com
 */

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * -@Configuration 和 @Bean 注解
 * -@Configuration 的注解类表示这个类可以使用 Spring IoC 容器作为 bean 定义的来源。
 */
@Configuration
/**
 * -@import 注解允许从另一个配置类中加载 @Bean 定义
 */
@Import(value = HelloWorldConfigA.class)
public class HelloWorldConfig {

    /**
     * - @Bean 注解告诉 Spring，一个带有 @Bean 的注解方法将返回一个对象，该对象应该被注册为在 Spring 应用程序上下文中的 bean。
     * @return
     */
    @Bean
    public TextEditor textEditor() {
        return new TextEditor(spellChecker());
    }

    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker();
    }

    /**
     * - @Bean 注解支持指定任意的初始化和销毁的回调方法，
     * 就像在 bean 元素中 Spring 的 XML 的初始化方法和销毁方法
     * @return
     */
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public InitAndDestroyByXml initAndDestroyByXml() {
        return new InitAndDestroyByXml();
    }

    public static void run() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        /**
         * 还可注册别的配置类
         * 该项内容可通过 @Import 做到
         */
        //context.register(HelloWorldConfig.class, HelloWorldConfig.class);
        TextEditor obj = context.getBean(TextEditor.class);
        obj.spellCheck();
        System.out.println("--------------------------");

        InitAndDestroyByXml obj1 = context.getBean(InitAndDestroyByXml.class);
        obj1.getMessage();
        AbstractApplicationContext ctx = (AbstractApplicationContext)context;

        System.out.println("--------------------------");

        Address obj2 = context.getBean(Address.class);
        obj2.toString();

        ctx.registerShutdownHook();
    }
}
