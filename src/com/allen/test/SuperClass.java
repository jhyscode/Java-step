package com.allen.test;

/**
 * @author ：jhys
 * @date ：Created in 2021/8/25 15:18
 * @Description ：
 */
public class SuperClass {
    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类构造代码块");
    }

    public SuperClass() {
        System.out.println("父类构造函数");
    }
}

class SubClass extends SuperClass {
    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类构造代码块");
    }

    public SubClass() {
        System.out.println("子类构造函数");
    }
}
class Test {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println("------------");
        SubClass sb1 = new SubClass();
    }
}