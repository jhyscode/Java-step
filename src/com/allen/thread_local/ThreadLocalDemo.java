package com.allen.thread_local;

import java.util.Random;

/**  两者访问的people是不一样的两个对象，而这就是ThreadLocal的作用，
 *   提供了变量线程间的隔离能力。
 * @author ：jhys
 * @date ：Created in 2021/9/1 22:02
 * @Description ：
 */
public class ThreadLocalDemo implements Runnable {

    private static ThreadLocal<People> local = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalDemo localDemo = new ThreadLocalDemo();

        Thread thread1 = new Thread(localDemo);
        thread1.start();

        Thread.sleep(1000);

        Thread thread2 = new Thread(localDemo);
        thread2.start();
    }

    @Override
    public void run() {
        People people = local.get();
        if (people == null) {
            people = new People();
            people.setName("djh");
            people.setAge(new Random().nextInt());
            local.set(people);
        }
        System.out.println(people);
    }
}
