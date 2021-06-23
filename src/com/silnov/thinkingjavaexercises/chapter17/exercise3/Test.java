package com.silnov.thinkingjavaexercises.chapter17.exercise3;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        Set<String> lhs = new LinkedHashSet<>();
        Set<String> ts = new TreeSet<>();
        for (int i = 0; i < Countries.DATA.length; i++) {
            hs.add(Countries.DATA[i][0]);
        }
        for (int i = 0; i < Countries.DATA.length; i++) {
            lhs.add(Countries.DATA[i][0]);
        }
        for (int i = 0; i < Countries.DATA.length; i++) {
            ts.add(Countries.DATA[i][0]);
        }
        System.out.println(hs);
        System.out.println();
        System.out.println(lhs);
        System.out.println();
        System.out.println(ts);
        System.out.println();
        for (int i = 0; i < Countries.DATA.length; i++) {
            hs.add(Countries.DATA[i][0]);
        }
        for (int i = 0; i < Countries.DATA.length; i++) {
            lhs.add(Countries.DATA[i][0]);
        }
        for (int i = 0; i < Countries.DATA.length; i++) {
            ts.add(Countries.DATA[i][0]);
        }
        System.out.println(hs);
        System.out.println();
        System.out.println(lhs);
        System.out.println();
        System.out.println(ts);
    }
}
