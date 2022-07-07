package com.lyx.annotations;

import java.lang.annotation.*;

/**
 * @author liao
 * @date 2022/7/6 23:26
 */

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DbSource {

    String value() default "master";

}
