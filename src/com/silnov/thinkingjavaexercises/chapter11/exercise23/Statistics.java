package com.silnov.thinkingjavaexercises.chapter11.exercise23;

import java.util.*;

public class Statistics {
    static int maxInt() {
        Random rand = new Random();
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            Integer freq = m.get(r); // [1]
            m.put(r, freq == null ? 1 : freq + 1);
        }
        int maxValue = 0;
        int maxKey = 0;
        for (int i = 0; i < m.keySet().size(); i++) {
            if (maxValue < m.get(i)) {
                maxValue = m.get(i);
                maxKey = i;
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < 2000; i++) {
            int x = maxInt();
            Integer freq = m.get(x);
            m.put(x, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}