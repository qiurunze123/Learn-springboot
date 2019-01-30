package com.geekq.springbootlearn3.annotation;

import java.lang.annotation.*;

/**
 * @author 邱润泽
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {
    String value() default "";
}
