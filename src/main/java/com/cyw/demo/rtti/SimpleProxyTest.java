package com.cyw.demo.rtti;

/**
 * @auther: chenyw
 * @time: 2020/8/22
 * @description:
 */
interface Interface {
    void doingSomething();

    void doingSomethingElse();
}

class RealObject implements Interface {

    @Override
    public void doingSomething() {
        System.out.println("Realobject doing sth");
    }

    @Override
    public void doingSomethingElse() {
        System.out.println("Realobject dofing sth else");
    }
}

class ProxyObject implements Interface {
    private Interface realObject;

    public ProxyObject(Interface realObject) {
        this.realObject = realObject;
    }

    @Override
    public void doingSomething() {
        System.out.println("代理sth");
        realObject.doingSomething();
    }

    @Override
    public void doingSomethingElse() {
        System.out.println("代理sthElse");
        realObject.doingSomethingElse();
    }
}


public class SimpleProxyTest {
    //    public static void consumer(Interface iface){
//        iface.doingSomething();
//        iface.doingSomethingElse();
//    }
//
//    public static void main(String[] args) {
////        consumer(new RealObject());
//        consumer(new ProxyObject(new RealObject()));
//    }
    public static void main(String[] args) {
        Interface iface = new ProxyObject(new RealObject());
        iface.doingSomething();
        iface.doingSomethingElse();
    }
}
