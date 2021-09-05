package com.cyw.demo.strings;

import java.util.Formatter;

/**
 * @auther: chenyw
 * @time: 2020/8/18
 * @description:
 */
public class Conversion {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);
        char u = 'a';
        formatter.format("s = %s \n",u);
        formatter.format("c = %c \n",u);
        formatter.format("b = %b \n",u);
        formatter.format("f = %f \n",u);
    }
}
