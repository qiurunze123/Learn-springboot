package com.geekq.springbootlearn2.configuration;

import com.geekq.springbootlearn2.annotation.EnableHelloWorld;
import com.geekq.springbootlearn2.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWorld 自动装配
 *
 * @author 小马哥
 * @since 2018/5/15
 */
@Configuration // Spring 模式注解装配
@EnableHelloWorld // Spring @Enable 模块装配
@ConditionalOnSystemProperty(name = "user.name", value = "qiurunze") // 条件装配
public class HelloWorldAutoConfiguration {

}
