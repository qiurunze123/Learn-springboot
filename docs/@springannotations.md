自动装配的第一个你要了解的便是 spring 模式注解装配 what is it ? **模式注解是一种用于声明在应用中扮演“组件”角色的注解。如 Spring Framework 中的 @Repository 标注在任何类上 ，用
于扮演仓储角色的模式注解** @Component 作为一种Spring容器托管的通用模式组件，任何被 @Component 标准的组件均为组件扫描的候选对象。类似地，凡是被 @Component 元标注（meta-annotated）的注解，
如 @Service ，当任何组件标注它时，也被视作组件扫描的候选对象!

### 模式注解举例
| Spring Framework  | 场景说明  | 起始版本  | 
| ----------------- | ---      | :--- |
|    @Repository    |数据仓储模式注解 | 2.0 |
|    @Component     |通用组件模式注解 | 2.5 |
|    @Service       |服务模式注解 | 2.5 |            
|    @Controller    |Web 控制器模式注解 |2.5 |            
|    @Configuration |配置类模式注解 |3.0 |     

一般来说装配方式有二种：一种是    <context:component-scan> 方式（spring 2.5提出的方案）

               <?xml version="1.0" encoding="UTF-8"?>
               <beans xmlns="http://www.springframework.org/schema/beans"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:context="http://www.springframework.org/schema/context"
                xsi:schemaLocation="http://www.springframework.org/schema/beans
                http://www.springframework.org/schema/beans/spring-beans.xsd
                http://www.springframework.org/schema/context http://www.springframework.org/schema/context/springcontext.
                xsd">
                <!-- 激活注解驱动特性 -->
                <context:annotation-config />
                <!-- 找寻被 @Component 或者其派生 Annotation 标记的类（Class），将它们注册为 Spring Bean -->
                <context:component-scan base-package="com.geekq.learn.spring.boot" />
                </beans>
                
 第二种是：@ComponentScan 方式 （spring 3.1提出的方案））
 
 
              @ComponentScan(basePackages = "com.geekq.learn.spring.boot")
              public class SpringConfiguration {
              ...
              }

自定义模式注解 **注解具有派生性和层次性**

派生性： FirstLevelRepository 注解上加上@Repository那么他也会变成一个注解，FirstLevelRepository派生Repository,@Repository派生至@Component

层次性： 显而易见一层一层的层级 @SecondLevelRepository 的使用就是表达了这个意思



        @SpringBootApplication |@SpringBootConfiguration|也大量的使用了模式注解
                               |@EnableAutoConfiguration|
                               |@ComponentScan          |