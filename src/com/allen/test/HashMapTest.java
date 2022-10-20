package com.allen.test;

import java.util.HashMap;

/**
 * @author ：jhys
 * @date ：Created in 2021/10/3 21:23
 * @Description ：
 */
public class HashMapTest {
    public static void main(String[] args) {
        // 创建一个 HashMap
        HashMap<String, Integer> prices = new HashMap<>();

        // 往HashMap中添加映射项
        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("HashMap: " + prices);

        int temp = prices.computeIfAbsent("aaa", key -> 280);
        System.out.println(temp);

        // 输出更新后的HashMap
        System.out.println("Updated HashMap: " + prices);
    }
}
