package com.cyw.demo.collection;

import com.cyw.demo.entity.Dog;
import com.fasterxml.jackson.databind.util.ArrayIterator;

import java.util.*;

/**
 * @auther: chenyw
 * @time: 2020/8/7
 * @description:
 */
public class IteratorTest {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        Dog dog1= new Dog(1,"aa",10);
        Dog dog2= new Dog(2,"aa",10);
        Dog dog3= new Dog(3,"aa",10);
        Dog dog4= new Dog(4,"aa",10);
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
//        Iterator<Dog> iterator = dogList.iterator();
////        while (iterator.hasNext()){ System.out.println(iterator.next());}
        ListIterator<Dog> listIterator = dogList.listIterator(2);
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
            System.out.println(listIterator.nextIndex());
        }
        System.out.println("==============");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
            System.out.println(listIterator.previousIndex());
        }
    }

    class CollectionSequence extends AbstractCollection<Dog>{

        @Override
        public Iterator<Dog> iterator() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }
    }
}
