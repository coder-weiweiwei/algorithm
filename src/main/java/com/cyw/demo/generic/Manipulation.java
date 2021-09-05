package com.cyw.demo.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: chenyw
 * @time: 2020/8/28
 * @description:
 */
class Manipulator<T>{
    private T obj;
    public Manipulator(T x){
        obj = x;
    }
    public void manipulator(){
        // 暂时无法知道obj是HasF对象，所以无法调用f()
        //obj.f();
    }
}

/**
 * 规定泛型边界达到调用方法的目的
 * @param <T>
 */
class Manioulator2<T extends HasF>{
    private T obj;
    public Manioulator2(T x){
        obj = x;
    }
    public void manipulator(){
        obj.f();
    }
}
class Manioulator3<T extends Number>{
    public void f(){
        System.out.println("Manioulator f()");
    }
}
public class Manipulation {
    public static void main(String[] args) {
        Manioulator3<Integer> manioulator3 = new Manioulator3<>();
        manioulator3.f();
    }
}
