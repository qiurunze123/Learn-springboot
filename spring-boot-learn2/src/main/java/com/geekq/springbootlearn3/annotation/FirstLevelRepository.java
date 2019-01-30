package com.geekq.springbootlearn3.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * @author 邱润泽
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {

    String value() default "";
}
