package com.cyw.demo.generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @auther: chenyw
 * @time: 2020/8/27
 * @description:
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> col,Generator<T> gen,int n){
        for(int i = 0; i < n ;i++){
            col.add(gen.next());
        }
        return col;
    }

    public static void main(String[] args) {
    }
}
