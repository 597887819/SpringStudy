package com.tutorialspoint;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

/**
 * Created by wug on 2016/1/21 0021 18:04.
 * email wug@shinemo.com
 */
@Configuration
public class HelloWorldConfigA {

    @Bean
    public Address address() {
        return new Address();
    }
}
