package com.allen.test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author ：jhys
 * @date ：Created in 2021/7/10 21:16
 * @Description ：
 */
public class ArrayTest {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end - start);
    }
}
