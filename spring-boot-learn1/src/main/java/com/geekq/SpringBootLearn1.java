package com.geekq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Hello world!
 * @author 邱润泽
 */
@SpringBootApplication
@ServletComponentScan(basePackages = "com.geekq.web.servlet")
public class SpringBootLearn1
{
    public static void main(String[] args) {
//.web(WebApplicationType.NONE) 设置非web应用
        new SpringApplicationBuilder(SpringBootLearn1.class)
        .run(args);
        //等价
//        SpringApplication.run(SpringBootLearn1.class, args);
    }
}
