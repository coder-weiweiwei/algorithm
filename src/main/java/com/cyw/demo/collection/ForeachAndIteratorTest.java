package com.cyw.demo.collection;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;

/**
 * @auther: chenyw
 * @time: 2020/8/9
 * @description:
 */
public class ForeachAndIteratorTest implements Iterable<String> {

    private String[] words = "a,b,c,d".split(",");
    private int index = 0;
    public Iterator<String> iterator(){
        return new Iterator<String>() {
            protected int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }

    public static void main(String[] args) {
        for (String s:new ForeachAndIteratorTest()) {
            System.out.println(s);
        }
    }
}

