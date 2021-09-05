package com.cyw.demo.generic;

/**
 * @auther: chenyw
 * @time: 2020/8/25
 * @description:
 */
public class TwoTuple<A,B> {
    private A first;
    private B second;

    public TwoTuple(A first,B second){
        this.first = first;
        this.second = second;
    }

    public A getFirst(){
        return first;
    }

    public B getSecond(){
        return second;
    }
}


class testTwoAndTree{
    public static void main(String[] args) {
        TwoTuple<String,Integer> twoTuple = new TwoTuple<>("aa",12);
        System.out.println(twoTuple.getFirst());
        System.out.println(twoTuple.getSecond());
    }
}
