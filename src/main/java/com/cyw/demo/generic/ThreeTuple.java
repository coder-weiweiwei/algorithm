package com.cyw.demo.generic;

/**
 * @auther: chenyw
 * @time: 2020/8/25
 * @description:
 */
public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {
    private C three;
    public ThreeTuple(A first, B second,C three) {
        super(first, second);
        this.three = three;
    }
}
