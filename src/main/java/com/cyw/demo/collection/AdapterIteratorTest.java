package com.cyw.demo.collection;

import java.util.*;

/**
 * @auther: chenyw
 * @time: 2020/8/9
 * @description:
 */

public class AdapterIteratorTest {
    public static void main(String[] args) {
        String[] wd = "a b c d e f g h".split(" ");
        ReversibaleIterator<String> reversibaleIterator = new ReversibaleIterator<>(Arrays.asList(wd));
        for (String s : reversibaleIterator) {
            System.out.println(s);
        }
        System.out.println("=========");
        for (String s : reversibaleIterator.reversed()) {
            System.out.println(s);
        }
    }
}


class ReversibaleIterator<T> extends ArrayList<T> {
    public ReversibaleIterator(Collection<T> collection) {
        super(collection);
    }
    public Iterable<T> reversed(){
        return new Iterable<T>(){
            public Iterator<T> iterator(){
                return new Iterator<T>() {
                    int current = size() - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };

//    public Iterator<T> reversed() {
//        return new Iterator<T>() {
//            int current = size() - 1;
//
//            @Override
//            public boolean hasNext() {
//                return current > -1;
//            }
//
//            @Override
//            public T next() {
//                return get(current--);
//            }
//
//            @Override
//            public void remove() {
//                throw new UnsupportedOperationException();
//            }
//        };
    }
}

