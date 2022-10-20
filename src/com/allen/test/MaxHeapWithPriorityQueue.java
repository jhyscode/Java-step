package com.allen.test;

import java.util.PriorityQueue;

/**
 * @author ：jhys
 * @date ：Created in 2021/9/4 22:53
 * @Description ：
 */
public class MaxHeapWithPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        pq.add(6);
        pq.add(9);
        pq.add(54);
        pq.add(5);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll() + "  ");
        }
    }
}
