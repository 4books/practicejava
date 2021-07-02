package com.company;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.pool.TypePool;

import java.io.*;
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


        System.out.println(new Moja().pullOut());
        System.out.println("test");


    }
}
