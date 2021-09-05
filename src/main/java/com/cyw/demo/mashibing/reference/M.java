package com.cyw.demo.mashibing.reference;

/**
 * @auther: chenyw
 * @time: 2020/9/27
 * @description:
 */
public class M {
    // 重写finalize
    @Override
    protected void finalize() throws Throwable {
        System.out.println("M finalize");
    }
}
