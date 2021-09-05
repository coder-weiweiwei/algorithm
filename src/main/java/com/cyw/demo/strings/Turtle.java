package com.cyw.demo.strings;

import java.util.Formatter;

/**
 * @auther: chenyw
 * @time: 2020/8/18
 * @description:
 */
public class Turtle {
    private String name;
    private Formatter formatter;

    public Turtle(String name,Formatter formatter){
        this.name = name;
        this.formatter = formatter;
    }

    public void f(int x, int y){
        formatter.format("%s is %d and %d:",name,x,y);
    }

    public static void main(String[] args) {
        Turtle t = new Turtle("cyw",new Formatter(System.err));
        t.f(10,100);
    }
}
