package com.cyw.demo.rtti;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @auther: chenyw
 * @time: 2020/8/24
 * @description:
 */
public class HiddenImplementation {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        A a = HiddenC.makeA();
        a.f();
        callHiddenMethod(a,"w");
    }

    public static void callHiddenMethod(Object a,String methodName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
