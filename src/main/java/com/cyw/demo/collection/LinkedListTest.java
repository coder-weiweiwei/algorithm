package com.cyw.demo.collection;

import com.cyw.demo.entity.Dog;
import com.cyw.demo.ioc.Do;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @auther: chenyw
 * @time: 2020/8/7
 * @description:
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Dog> linkedList = new LinkedList<>();
        Dog dog1= new Dog(1,"aa",10);
        Dog dog2= new Dog(2,"aa",10);
        Dog dog3= new Dog(3,"aa",10);
        Dog dog4= new Dog(4,"aa",10);
        linkedList.add(dog1);
        linkedList.add(dog2);
        linkedList.add(dog3);
        linkedList.add(dog4);
        System.out.println("getFirst():"+linkedList.getFirst());
    }
}
