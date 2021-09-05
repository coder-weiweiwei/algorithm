package com.cyw.demo.generic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther: chenyw
 * @time: 2020/8/27
 * @description:
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args){
        List<T> result = new ArrayList<>();
        for (T r:args){
            result.add(r);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> asd = makeList("asd","dfas");
        System.out.println();
    }
}
