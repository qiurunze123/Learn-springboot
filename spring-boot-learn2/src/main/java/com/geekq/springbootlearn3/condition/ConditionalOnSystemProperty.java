package com.geekq.springbootlearn3.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 *  java系统属性
 * @author 邱润泽
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {

    /**
     * Java 系统属性名称
     * @return
     */
    String name();

    /**
     * Java 系统属性值
     * @return
     */
    String value();
}
