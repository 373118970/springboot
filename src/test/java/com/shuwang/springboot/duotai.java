package com.shuwang.springboot;

import org.junit.Test;

public class duotai {
    @Test
    public void test(){
        A a = new C();
        a.method();
        C c = (C) a;
        c.method1();
    }
}

class A{
    public void method(){
        System.out.println("AAAA");
    }
}

class B extends A{
    public void method(){
        System.out.println("BBBB");
    }
}

class C extends B{
    public void method(){
        System.out.println("CCCC");
    }
    public void method1(){
        System.out.println("C自己的方法");
    }
}