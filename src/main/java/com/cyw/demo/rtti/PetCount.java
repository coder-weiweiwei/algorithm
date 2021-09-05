package com.cyw.demo.rtti;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther: chenyw
 * @time: 2020/8/21
 * @description:
 */
public class PetCount {
    public static void main(String[] args) {
        HashMap<String, Integer> counter = new HashMap<>();
        List<Object> types = new ArrayList<>();
        types.add(new Integer(1));
        types.add(new Integer(10));
        types.add(new String("a"));
        counter =count(counter,types);
        System.out.println(counter);

    }

    public static HashMap<String, Integer> count(HashMap<String, Integer> map, List<Object> types) {
        for (int i = 0; i < types.size(); i++) {
            String clazz = String.valueOf(types.get(i).getClass());
            Integer count = (Integer) map.get(clazz);
            if (null == count) {
                map.put(clazz, 1);
            } else {
                map.put(clazz, ++count);
            }
        }
        return map;
    }
}
