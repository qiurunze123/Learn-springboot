package com.geekq.springbootlearn3.configuration;

import org.springframework.context.annotation.Bean;

/**
 * @author 邱润泽
 */
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld(){
        return "hello world ! 2018";
    }
}
