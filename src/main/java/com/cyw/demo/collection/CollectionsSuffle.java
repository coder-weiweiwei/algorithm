package com.cyw.demo.collection;

import java.util.*;

/**
 * @auther: chenyw
 * @time: 2020/8/9
 * @description:
 */
public class CollectionsSuffle {
    public static void main(String[] args) {
        String[] arr = "a,b,c,d,e,f".split(",");
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        List<String> arrList2 = Arrays.asList(arr);
        System.out.println("before1:"+arrList);
        Collections.shuffle(arrList);
        System.out.println("after1:"+arrList);
        System.out.println(Arrays.toString(arr));
        System.out.println("=========");
        System.out.println("brfore2:"+arrList2);
        Collections.shuffle(arrList2);
        System.out.println("agter2:"+arrList2);
        System.out.println(Arrays.toString(arr));
    }
}
