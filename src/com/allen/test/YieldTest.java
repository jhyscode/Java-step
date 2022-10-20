package com.allen.test;

/**
 * @author ：jhys
 * @date ：Created in 2021/9/28 23:48
 * @Description ：
 */
public class YieldTest {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA("t1");
        ThreadA t2 = new ThreadA("t2");
        t1.start();
        t2.start();
    }
}


class ThreadA extends Thread {
    public ThreadA(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s [%d]:%d\n", this.getName(), this.getPriority(), i);
            if (i % 6 == 0) {
                Thread.yield();
            }
        }
    }
}