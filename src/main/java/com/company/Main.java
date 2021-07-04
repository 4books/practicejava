package com.company;

import com.reflectionexample.Book;
import com.reflectionexample.MyBook;
import com.sampleannotation.MyAnnotation;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.pool.TypePool;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Main {

    public static void main(String[] args) {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String s = bf.readLine();
//        bw.write(s);
//        bw.flush();
//        bw.close();

//        System.out.println(App.class.getClassLoader());
//        System.out.println(App.class.getClassLoader().getParent());

//        ClassLoader classLoader = Main.class.getClassLoader();
//        TypePool typePool = TypePool.Default.of(classLoader);
//
//        try {
//            new ByteBuddy().redefine(
//                        typePool.describe("com.company.Moja").resolve(),
//                        ClassFileLocator.ForClassLoader.of(classLoader)
//                    )
//                    //Method 지정
//                    .method(named("pullOut"))
//                    //해당 method를 가로채 value를 넣음
//                    .intercept(FixedValue.value("Rabbit!"))
//                    //class파일을 만드는데 해당 패키지 경로를 따라가기 때문에 패키지 경로는 생략
//                    .make()
//                    .saveIn(new File("C:\\Users\\joonw\\IdeaProjects\\practicejava\\target\\classes"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        System.out.println(new Moja().pullOut());
//        System.out.println("test");



//        리플렉션

        Class<Book> bookClass = Book.class;

        Book book = new Book();
        Class<? extends Book> aClass = book.getClass();

        try {
            Class<?> bClass = Class.forName("com.reflectionexample.Book");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("=============================");
        //public field 출력
        Arrays.stream(bookClass.getFields()).forEach(System.out::println);

        System.out.println("=============================");
        //모든 field 출력
        Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println);

        System.out.println("=============================");
        //Interface 출력
        Arrays.stream(MyBook.class.getInterfaces()).forEach(System.out::println);

        System.out.println("=============================");
        //super class
        System.out.println(MyBook.class.getSuperclass());

        System.out.println("=============================");
        //Constructor
        Arrays.stream(bookClass.getDeclaredConstructors()).forEach(System.out::println);

        System.out.println("=============================");
        //Modifier
        Arrays.stream(Book.class.getDeclaredFields()).forEach(f ->{
            int modifiers = f.getModifiers();
            System.out.println(f);
            System.out.println(Modifier.isPrivate(modifiers));
            System.out.println(Modifier.isStatic(modifiers));
            System.out.println(Modifier.isPublic(modifiers));
        });

        Arrays.stream(Book.class.getDeclaredFields()).forEach(f ->{
            Arrays.stream(f.getAnnotations()).forEach(a ->{
                if(a instanceof MyAnnotation){
                    MyAnnotation myAnnotation = (MyAnnotation)a;
                    System.out.println(myAnnotation.name());
                    System.out.println(myAnnotation.number());
                }
            });
        });


    }
}
