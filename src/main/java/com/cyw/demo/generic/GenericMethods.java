package com.cyw.demo.generic;

/**
 * @auther: chenyw
 * @time: 2020/8/27
 * @description:
 */
public class GenericMethods {
    public static <T> void f(T a){
        System.out.println(a.getClass());
    }

    public static void main(String[] args) {
        f("asd");
        f(1.0);
        f(1L);
        f(1.0F);
    }
}
