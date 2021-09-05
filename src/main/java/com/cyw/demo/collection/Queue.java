package com.cyw.demo.collection;

import java.util.*;

/**
 * @auther: chenyw
 * @time: 2020/8/8
 * @description:
 */
public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random rand = new Random(47);
        for(int i= 0; i < 10; i++){
            priorityQueue.offer(rand.nextInt(i+10));
        }
       while (priorityQueue.peek() != null){
           System.out.println(priorityQueue.poll());
//           System.out.println(priorityQueue.remove());
       }

    }

}
