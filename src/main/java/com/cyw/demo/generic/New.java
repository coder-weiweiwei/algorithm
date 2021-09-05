package com.cyw.demo.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther: chenyw
 * @time: 2020/8/27
 * @description:
 */
public class New {
    public  static <K,V> Map<K,V> map(){
        return new HashMap<K,V>();
    }

    public static <T> ArrayList<T> list(){
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        ArrayList<String> list = New.list();
        list.add("aaa");
        System.out.println(list);
    }
}
