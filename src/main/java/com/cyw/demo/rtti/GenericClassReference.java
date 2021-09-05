package com.cyw.demo.rtti;

/**
 * @auther: chenyw
 * @time: 2020/8/20
 * @description:
 */
public class GenericClassReference {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> integerClass = intClass;
        Class<Long> longClass = intClass;
        Class<? extends Number> sonOfNumClass = integerClass;
    }
}
