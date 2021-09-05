package com.cyw.demo.collection;

import com.cyw.demo.entity.Dog;

import java.util.LinkedList;

/**
 * @auther: chenyw
 * @time: 2020/8/7
 * @description:
 */
public class MyStack<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T obj){
        storage.addFirst(obj);
    }
    public T peek(){
        return storage.getFirst();
    }

    public T pop(){
        return storage.removeFirst();
    }

    public boolean empty(){
        return  storage.isEmpty();
    }

    public String toString(){
        return storage.toString();
    }

    public static void main(String[] args) {
        LinkedList<Dog> linkedList = new LinkedList<>();
        Dog dog1= new Dog(1,"aa",10);
        Dog dog2= new Dog(2,"aa",10);
        Dog dog3= new Dog(3,"aa",10);
        Dog dog4= new Dog(4,"aa",10);

        MyStack<Dog> dogMyStack = new MyStack<>();
        dogMyStack.push(dog1);
        dogMyStack.push(dog2);
        dogMyStack.push(dog3);
        dogMyStack.push(dog4);
        System.out.println(dogMyStack.peek());
    }
}
