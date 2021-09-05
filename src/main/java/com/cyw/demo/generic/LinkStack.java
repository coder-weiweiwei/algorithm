package com.cyw.demo.generic;


import org.dom4j.Node;

/**
 * @auther: chenyw
 * @time: 2020/8/25
 * @description: 自定义栈
 */
public class LinkStack<T> {
    /**
     * 静态内部类 Node
     */
    public static class Node<U>{
        //当前节点元素
        private U item;
        //下一个节点
        private Node<U> next;
        //默认构造器
        public Node(){
            item = null;
            next = null;
        }
        // 带参构造器
        public Node(U item,Node<U> next){
            this.item = item;
            this.next = next;
        }
    }

    // 初始化末端哨兵
    private Node<T> top = new Node<>();

    // 压入元素
    public void push(T item){
        top = new Node<>(item,top);
    }

    //弹出元素
    public T pop(){
        T result = top.item;
        if(null != top.next){
            top = top.next;
        }
        return result;
    }
}
