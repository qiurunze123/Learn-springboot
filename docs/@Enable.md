Spring Framework 3.1 开始支持”@Enable 模块驱动“。所谓“模块”是指具备相同领域的功能组件集合， 组合所形成一个独立
的单元。比如 Web MVC 模块、AspectJ代理模块、Caching（缓存）模块、JMX（Java 管 理扩展）模块、Async（异步处
理）模块等！

![举例](https://raw.githubusercontent.com/qiurunze123/imageall/master/springboot2.png)

基于注解驱动实现 - @EnableHelloWorld

HelloWorldImportSelector -> HelloWorldConfiguration -> HelloWorld


