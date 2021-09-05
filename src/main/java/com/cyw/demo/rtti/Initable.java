package com.cyw.demo.rtti;

/**
 * @auther: chenyw
 * @time: 2020/8/20
 * @description:
 */

class Initable2 {
    static final int num = 100;
    static {
        System.out.println("i1111");
    }
}

class Initable3{
    static final int num = 200;
    static {
        System.out.println("i222222");
    }
}


public class Initable {
    public static void main(String[] args) {
        // 不会对类初始化
        Class<Initable2> initable2Class = Initable2.class;
        Class<Initable3> initable3Class = Initable3.class;
        try {
            // 会对类初始化
            Class<?> initable2 = Class.forName("com.cyw.demo.rtti.Initable2");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}


