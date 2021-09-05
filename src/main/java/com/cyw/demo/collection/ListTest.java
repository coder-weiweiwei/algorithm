package com.cyw.demo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: chenyw
 * @time: 2020/8/5
 * @description:
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("d");
        Object[] d = list.toArray();
        System.out.println(Arrays.toString(d));
    }
}
