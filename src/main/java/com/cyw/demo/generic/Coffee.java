package com.cyw.demo.generic;

/**
 * @auther: chenyw
 * @time: 2020/8/26
 * @description:
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    public String toString() {
        return getClass().getName() + "  " + id;
    }
}

class Mocha extends Coffee {
}

class Capccino extends Coffee {
}

class Latte extends Coffee {
}
