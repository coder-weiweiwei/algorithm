package com.cyw.demo.mashibing.reference;

import java.io.IOException;
import java.lang.ref.SoftReference;

/**
 * @auther: chenyw
 * @time: 2020/9/27
 * @description:
 */
public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        softReference();
    }

    /**
     * 强应用
     */
    public static void hardReference() throws IOException {
        M m = new M();
        m = null;
        System.gc();
        System.out.println(m);
        System.in.read();
    }

    /**
     * 软引用
     */
    public static void softReference() throws InterruptedException {
        SoftReference<byte[]> m = new SoftReference<>(new byte[1024*1024*10]);
        System.out.println(m.get());
        System.gc();
        Thread.sleep(500);
        // 此时gc并不会回收该弱引用
        System.out.println(m.get());
        byte[] b = new byte[1024*1024*15];
        // 如果此时堆内存不够，系统会进行垃圾回收把弱引用干掉
        System.out.println(m.get());
    }
}
