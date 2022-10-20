package com.allen.test;

/**
 * @author ：jhys
 * @date ：Created in 2021/12/1 17:11
 * @Description ：
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {});
        thread.start();
        Thread.sleep(10000000);
        System.out.println(thread.getState());
    }
}
