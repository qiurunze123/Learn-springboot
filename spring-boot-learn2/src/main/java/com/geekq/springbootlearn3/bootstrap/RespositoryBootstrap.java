package com.geekq.springbootlearn3.bootstrap;

import com.geekq.springbootlearn3.respository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 邱润泽
 */
@ComponentScan(basePackages = "com.geekq.springbootlearn3.respository")
public class RespositoryBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RespositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        // myFirstLevelRepository Bean 是否存在
        MyFirstLevelRepository myFirstLevelRepository =
                context.getBean("MyFirstLevelRepository",MyFirstLevelRepository.class);

        System.out.println("MyFirstLevelRepository Bean : "+myFirstLevelRepository);

        // 关闭上下文
        context.close();
    }
}
