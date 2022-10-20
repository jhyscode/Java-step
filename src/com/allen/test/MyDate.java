package com.allen.test;

import java.util.Date;

/**
 * 说明：finalize()函数是在JVM回收内存时执行的，但JVM并不保证在回收内存时一定会调用finalize()。
 */
public class MyDate extends Date {

    /** Creates a new instance of MyDate */
    public MyDate() {

    }
    // 覆盖finalize()方法
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("obj [Date: " + this.getTime() + "] is gc");
    }   

    public String toString() {
        return "Date: " + this.getTime();
    }
}