package com.tutorialspoint;

import org.springframework.context.ApplicationContext;

/**
 * Created by wug on 2016/1/19 0019 11:08.
 * email wug@shinemo.com
 */
public class Bean {

    static void scope(ScopeEnum enumer) {
        ApplicationContext context = IocContainer.initBeansXml1();
        HelloWorld helloWorldA = (HelloWorld)context.getBean(enumer.getScope());
        helloWorldA.setMessage("I'm object A");
        helloWorldA.getMessage();
        HelloWorld helloWorldB = (HelloWorld)context.getBean(enumer.getScope());
        helloWorldB.getMessage();
    }

    enum ScopeEnum {
        SINGLETON("helloWorldSingleton"),
        PROTOTYPE("helloWorldPrototype");

        ScopeEnum(String scope) {
            this.scope = scope;
        }

        private final String scope;

        public String getScope() {
            return scope;
        }
    }
}
