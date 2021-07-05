package com.reflectionsexample2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main2 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> bookClass = Class.forName("com.reflectionsexample2.Book");
        Constructor<?> constructor = bookClass.getConstructor(String.class);
        Book book = (Book)constructor.newInstance("myBook");
        System.out.println(book);

        Field a = Book.class.getDeclaredField("A");
        System.out.println(a.get(null));
        a.set(null, "AAAA");
        System.out.println(a.get(null));

    }
}
