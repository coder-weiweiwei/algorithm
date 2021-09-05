package com.cyw.demo.rtti;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @auther: chenyw
 * @time: 2020/8/24
 * @description: 动态代理测试
 */

/**
 * 动态代理控制器
 */
class DynamicHandlerController implements InvocationHandler {
    private Object real;

    public DynamicHandlerController(Object real) {
        this.real = real;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理被执行");
        return method.invoke(real, args);
    }
}

public class DynamicProxyTest {
    public static void main(String[] args) {
        // 实例化代理类
        Interface proxy = (Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicHandlerController(new RealObject()));
        // 代理执行方法
        proxy.doingSomethingElse();
        proxy.doingSomething();
    }
}





