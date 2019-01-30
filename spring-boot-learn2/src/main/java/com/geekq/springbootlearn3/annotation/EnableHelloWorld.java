package com.geekq.springbootlearn3.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 激活模块
 * @author 邱润泽
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
//@Import(HelloWorldConfiguration.class)
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}
