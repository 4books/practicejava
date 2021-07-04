package com.reflectionexample;

import com.sampleannotation.AnotherAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@AnotherAnnotation("test1")
public class MyBook extends Book implements MyInterface{


}
