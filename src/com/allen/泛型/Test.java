package com.allen.泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：jhys
 * @date ：Created in 2021/5/16 7:45
 * @Description ：
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        System.out.println(a.getClass() == b.getClass());
    }
}
