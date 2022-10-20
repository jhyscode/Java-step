package com.allen.test;

/**
 * @author ：jhys
 * @date ：Created in 2021/9/17 11:02
 * @Description ：
 */
public class StringTest {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "a" + "bc";
        System.out.println(str1 == str2);
    }
}
class A {

    private int x;         // 实例变量
    private static int y;  // 静态变量

    public static void main(String[] args) {
//        int x = A.x;  // Non-static field 'x' cannot be referenced from a static context
        A a = new A();
        int x = a.x;
        int y = A.y;
    }
}