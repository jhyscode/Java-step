package com.allen.test;

/**
 * @author ：jhys
 * @date ：Created in 2021/8/28 13:08
 * @Description ：
 */
public class HelloA {
    public HelloA(){//构造函数
        System.out.println("A的构造函数");
    }
    {//构造代码块
        System.out.println("A的构造代码块");
    }
    static {
        System.out.println("A的静态代码块");
    }
}

class HelloB extends HelloA {

    public HelloB(){//构造函数
        System.out.println("B的构造函数");
    }
    {//构造代码块
        System.out.println("B的构造代码块");
    }
    static {//静态代码块
        System.out.println("B的静态代码块");
    }

    public static void main(String[] args) {
        HelloB b = new HelloB();
    }
}