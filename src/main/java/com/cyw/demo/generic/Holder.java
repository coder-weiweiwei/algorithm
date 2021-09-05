package com.cyw.demo.generic;

/**
 * @auther: chenyw
 * @time: 2020/8/25
 * @description:
 */
public class Holder<T> {
    public T a;
    public Holder(T a){
        this.a = a;
    }
    public T getA(){
        return a;
    }
}
class test{

    public static TwoTuple<Integer,String> getTwo(){
        return new TwoTuple<Integer, String>(11,"as");
    }

    public static ThreeTuple<String,Integer,String> getThree(){
        return new ThreeTuple<String,Integer,String>("sa",32,"sda");
    }

    public static void main(String[] args) {
        System.out.println(getTwo());
        System.out.println(getThree());
    }
}
