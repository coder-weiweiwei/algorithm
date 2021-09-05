package com.cyw.demo.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: chenyw
 * @time: 2020/8/18
 * @description:
 */
public class InfeniteRecursion {

    /**
     * 方法中return this，打赢时该方法会被循环调用
     * @return
     */
    public String toString() {
        return ""+this;
    }

    public static void main(String[] args) {
        List<InfeniteRecursion> infeniteRecursions = new ArrayList<>();
        for (int i = 0 ; i < 10; i++){
            infeniteRecursions.add(new InfeniteRecursion());
        }

        System.out.println(infeniteRecursions);
    }
}
