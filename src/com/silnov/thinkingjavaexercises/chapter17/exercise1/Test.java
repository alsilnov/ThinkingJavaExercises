package com.silnov.thinkingjavaexercises.chapter17.exercise1;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        List<String> lList = new LinkedList<>();
        for (int i = 0; i < Countries.DATA.length; i++) {
            aList.add(Countries.DATA[i][0]);
            lList.add(Countries.DATA[i][1]);
        }
        Collections.sort(aList);
        Collections.sort(lList);
        System.out.println("Countries: " + aList);
        System.out.println();
        System.out.println("CapitaLists: " + lList);
        System.out.println();
        for (int i = 0; i < 2; i++) {
            Collections.shuffle(aList);
            Collections.shuffle(lList);
            System.out.println("Countries " + i + ": " + aList);
            System.out.println();
            System.out.println("Capitals " + i + ": " + lList);
            System.out.println();
        }
    }
}
