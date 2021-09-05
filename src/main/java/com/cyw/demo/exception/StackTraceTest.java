package com.cyw.demo.exception;

/**
 * @auther: chenyw
 * @time: 2020/8/14
 * @description: 栈轨迹测试
 */
public class StackTraceTest {

    static void a(){
        b();
    }

    static void b(){
        try{
            throw new Exception();
        }catch (Exception e){
            for(StackTraceElement ste:e.getStackTrace()){
                System.out.println("e.getStackTrace()"+ste);
            }

//            System.out.println("e.getName():"+);

        }
    }

    public static void main(String[] args) {
        a();
    }
}


