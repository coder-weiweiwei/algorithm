package com.cyw.demo.generic;

import java.util.ArrayList;

/**
 * @auther: chenyw
 * @time: 2020/8/28
 * @description:
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class aClass = new ArrayList<Integer>().getClass();
        Class bClass = new ArrayList<String>().getClass();
        // 下面起始结果为true
        System.out.println(aClass == bClass);

    }
}
