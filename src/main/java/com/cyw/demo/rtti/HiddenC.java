package com.cyw.demo.rtti;

/**
 * @auther: chenyw
 * @time: 2020/8/24
 * @description:
 */
public class HiddenC{
    public static A makeA(){
        return new C();
    }
}

class  C implements A{
    @Override
    public void f() {
        System.out.println("public C.f()");
    }

    public void g(){
        System.out.println("public  C.g()");
    }

    void u(){
        System.out.println("package C.u()");
    }

    protected void v(){
        System.out.println("protected C.v()");
    }

    private void w(){
        System.out.println("private C.w()");
    }
}
