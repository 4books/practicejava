package com.reflectionsexample2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main2 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> bookClass = Class.forName("com.reflectionsexample2.Book");
        Constructor<?> constructor = bookClass.getConstructor(String.class);

        Book book = (Book)constructor.newInstance("myBook");
        System.out.println(book);

        Field b = Book.class.getDeclaredField("B");
        b.setAccessible(true);
        System.out.println(b.get(book));
        b.set(book, "BBBB");
        System.out.println(b.get(book));

        Method c = Book.class.getDeclaredMethod("c");
        c.setAccessible(true);
        c.invoke(book);

        Method d = Book.class.getDeclaredMethod("sum", int.class, int.class);
        int invoke = (int)d.invoke(book, 1, 2);
        System.out.println(invoke);


    }
}
