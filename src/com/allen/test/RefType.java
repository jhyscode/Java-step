package com.allen.test;

import java.lang.ref.SoftReference;

/**
 * @author ：jhys
 * @date ：Created in 2021/9/21 23:49
 * @Description ：
 */
public class RefType {
    public static void main(String[] args) {
        Object obj = new Object();
        SoftReference<Object> sf = new SoftReference<>(obj);
        obj = null; // 使对象只被软引用关联
    }
}

/**
 * 强引用
 */
class RefType2 {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        System.gc();
    }
}

class SoftReferenceTest {
    public static void main(String[] args) {
        SoftReference ref = new SoftReference(new MyDate());
        ReferenceTest.drainMemory();
    }
}