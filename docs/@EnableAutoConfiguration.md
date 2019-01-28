启动类中@SpringBootApplication 进行点击发现其中其中有几个注解@SpringBootConfiguration @EnableAutoConfiguration
@ComponentScan 可以试下如果在启动类中写如下三个注解依旧是可以启动的！
    
    这是EnableAutoConfiguration的代码
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @Inherited
    @AutoConfigurationPackage
    @Import(AutoConfigurationImportSelector.class) ** 所有符合条件的@Configuration配置都加载到当前SpringBoot创建并使用的IoC容器
    public @interface EnableAutoConfiguration 
    
    
    
在AutoConfigurationImportSelector类中可以看到通过 SpringFactoriesLoader.loadFactoryNames()把 spring-boot-autoconfigure.jar/META-INF/spring.factories
中每一个xxxAutoConfiguration文件都加载到容器中，spring.factories文件里每一个xxxAutoConfiguration文件一般都会有下面的条件注解:


https://blog.csdn.net/zxc123e/article/details/80222967