#### SpringApplication运行有两种方式：

    ①通过 SpringApplication API 调整
    SpringApplication springApplication = new SpringApplication(DiveInSpringBootApplication.class);
    springApplication.setBannerMode(Banner.Mode.CONSOLE);
    springApplication.setWebApplicationType(WebApplicationType.NONE);
    springApplication.setAdditionalProfiles("prod");
    springApplication.setHeadless(true);
    
    ②通过 SpringApplicationBuilder API 调整
    
     new SpringApplicationBuilder(DiveInSpringBootApplication.class)
    .bannerMode(Banner.Mode.CONSOLE)
    .web(WebApplicationType.NONE)
    .profiles("prod")
    .headless(true)
    .run(args);
    
    
#### 准备阶段

1.配置spring bean 来源

Java 配置 Class 或 XML 上下文配置文件集合,用于 Spring Boot BeanDefinitionLoader 读取 ,并且将配置源解析加载为
Spring Bean 定义!

1.java 配置 Class 用于 Spring 注解驱动中 Java 配置类,大多数情况是 Spring 模式注解所标注的类,如 @Configuration

2.XML 上下文配置文件 用于 Spring 传统配置驱动中的 XML 文件

     @SpringBootApplication -- @SpringBootConfiguration -- @Configuration -- @Component 
     说明@SpringBootApplication就是一个注解或者是配置bean,SpringBootLearn2Application.class
     作为一个class参数传进去

2.推断web应用类型 和 主引导类（main class）

3.加载 -- 应用上下文初始器 和 应用事件监听器