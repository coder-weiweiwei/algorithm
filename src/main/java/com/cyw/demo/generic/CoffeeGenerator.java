package com.cyw.demo.generic;

import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @auther: chenyw
 * @time: 2020/8/26
 * @description: Coffee生成器，用于随机生成coffee对象
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] classes = new Class[]{Mocha.class, Latte.class, Capccino.class};
    private Random random = new Random(20);
    private int size = 0;

    public CoffeeGenerator() {

    }

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) classes[new Random().nextInt(classes.length)].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return null;
    }

    class CoffeeIerator implements Iterator<Coffee> {
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 3 ;i ++){
            System.out.println(gen.next());
        }
        for (Coffee c:new CoffeeGenerator(3)){
            System.out.println(c);
        }
    }
}
