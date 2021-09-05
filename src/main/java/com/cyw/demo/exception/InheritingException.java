package com.cyw.demo.exception;

/**
 * @auther: chenyw
 * @time: 2020/8/12
 * @description:
 */

class SimpleException extends  Exception{
        }
public class InheritingException {
    public void e() throws SimpleException{
        System.out.println("go!");
        throw new SimpleException();
    }
    public static void main(String[] args) {
        InheritingException inheritingException = new InheritingException();
        try {
            inheritingException.e();
        } catch (SimpleException e) {
            throw new RuntimeException("sb");
        }
    }
}
