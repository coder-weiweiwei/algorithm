package com.cyw.demo.exception;

/**
 * @auther: chenyw
 * @time: 2020/8/12
 * @description:
 */

class MyException extends Exception{
    public MyException() {
    }
    public MyException(String msg){
        super(msg);
    }
}

public class FullConstructor {
    public void f() throws MyException{
        System.out.println("f(): ");
        throw new MyException("f()报错");
    }
    public void g() throws MyException{
        System.out.println("g(): ");
        throw new MyException("g() 报错");
    }

    public static void main (String[] args) {
        FullConstructor fullConstructor = new FullConstructor();
        try{
            fullConstructor.f();
        }catch (MyException e){
            e.printStackTrace();
        }
        try {
            fullConstructor.g();
        }catch (MyException e){
            e.printStackTrace();
        }
    }
}
