package com.reflectionexample;

import com.sampleannotation.MyAnnotation;

@MyAnnotation(test = "test")
public class Book {
    private static String b = "Book B";
    private static final String c = "Book C";

    @MyAnnotation(test = "test")
    private String a = "Book A";
    public String d = "Book D";
    protected String e = "Book E";

    public Book() {

    }

    public Book(String a, String d, String e) {
        this.a = a;
        this.d = d;
        this.e = e;
    }

    private void f(){
        System.out.println("F");
    }

    public void g(){
        System.out.println("g");
    }

    public int h(){
        return 100;
    }


}
