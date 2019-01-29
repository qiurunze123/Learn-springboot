自动装配实现: 激活自动装配,实现自动装配，配置自动装配实现

spring工厂加载机制: SpringFactoriesLoader 实现类里面会有一个loadFactories加载配置之前在**配置资源：META-INF/spring.factories**

自定义实现装配方式：

     实现方法
     1. 激活自动装配 - @EnableAutoConfiguration
     2. 实现自动装配 - XXXAutoConfiguration
     3. 配置自动装配实现 - META-INF/spring.factories
     
自定义自动装配的实现流程：详情请看--
       
            HelloWorldAutoConfiguration
            条件判断： user.name == "Mercy"
            模式注解： @Configuration
            @Enable 模块： @EnableHelloWorld -> 
            HelloWorldImportSelector -> HelloWorldConfiguration - > helloWorld