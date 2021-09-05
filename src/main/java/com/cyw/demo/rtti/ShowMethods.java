package com.cyw.demo.rtti;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @auther: chenyw
 * @time: 2020/8/22
 * @description:
 */
public class ShowMethods {
    public static void main(String[] args) {
        f(Integer.class);
    }


    public static void f(Class<? extends Number> clazz){
        Method[] methods = clazz.getMethods();
        Constructor[] constructor = clazz.getConstructors();
        System.out.println(Arrays.toString(methods));
        System.out.println(Arrays.toString(constructor));
    }
}
