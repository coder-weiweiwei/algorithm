package com.cyw.demo.strings;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @auther: chenyw
 * @time: 2020/8/19
 * @description:
 */
public class SplitDemo {
    public static void main(String[] args) {
        String word = "hello! word! haha! choub";
        System.out.println(Arrays.toString(Pattern.compile("!").split(word,2)));
    }
}
