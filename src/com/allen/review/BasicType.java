package com.allen.review;

/**
 * @author ：jhys
 * @date ：Created in 2022/4/28 22:56
 * @Description ：
 */

public class BasicType {
    public static void main(String[] args) {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x == y);

        Integer z = Integer.valueOf(123);
        Integer k = Integer.valueOf(123);
        System.out.println(z == k);   // true
    }
}
