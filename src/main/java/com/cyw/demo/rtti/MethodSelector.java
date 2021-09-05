package com.cyw.demo.rtti;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @auther: chenyw
 * @time: 2020/8/24
 * @description: 过滤掉指定方法
 */
public class MethodSelector {
    // 实例化代理对象
    public static void main(String[] args) {
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),new Class[]{Interface.class},new DynamicProxyController(new RealObject()));
        proxy.doingSomething();
        proxy.doingSomethingElse();
    }
}


/**
 * 动态代理控制器
 */
class DynamicProxyController implements InvocationHandler {
    // 被代理的类
    private Object real;

    public DynamicProxyController(Object real){
        this.real = real;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //过滤掉指定方法名
        if("doingSomething".equals(method.getName())) {
            System.out.println("doingSomething方法不能使用动态代理哦");

            return null;
        }
            System.out.println("动态代理执行方法");
            return method.invoke(real, args);
    }
}
