package com.cyw.demo.generic;

import java.util.*;

/**
 * @auther: chenyw
 * @time: 2020/8/28
 * @description:
 */
public class LostInformation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
    }
}
