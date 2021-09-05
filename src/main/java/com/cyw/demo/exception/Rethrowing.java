package com.cyw.demo.exception;

/**
 * @auther: chenyw
 * @time: 2020/8/14
 * @description:
 */
public class Rethrowing {

    public static void f() throws Exception {
        System.out.println("handle f()");
        throw new Exception("myException");
    }

    public static void main(String[] args) throws Exception {
        try {
            f();
        } catch (Exception e) {
            //整个调用栈
            e.printStackTrace(System.err);
            //这一行成了
            throw (Exception) e.fillInStackTrace();

        }
    }

}
