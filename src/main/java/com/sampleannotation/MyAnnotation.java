package com.sampleannotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Inherited //상속이 되는 annotation
public @interface MyAnnotation {
    String name() default "naegwon";
    int number() default 100;
    String test();
}
