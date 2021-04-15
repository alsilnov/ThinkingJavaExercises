package com.silnov.thinkingjavaexercises.chapter11.exercise5;

import java.util.*;

public class ListFeatures {
    private static List<Integer> randomInteger(int lenght, int maxValue) {
        List<Integer> list = new ArrayList<Integer>();
        Random rand = new Random(3547);
        while (lenght-- != 0) {
            list.add(rand.nextInt(maxValue));
        }
        return list;
    }

    public static void main(String[] args) {
        Random rand = new Random(3203);
        List<Integer> numbs = randomInteger(10, 23);
        System.out.println("1: " + numbs);
        Integer h = rand.nextInt(23);
        numbs.add(h); // Automatically resizes
        System.out.println("2: " + numbs);
        System.out.println("3: " + numbs.contains(h));
        numbs.remove(h); // Remove by object
        Integer p = numbs.get(2);
        System.out.println("4: " + p + " " + numbs.indexOf(p));
        Integer cymric = rand.nextInt(22);
        System.out.println("5: " + numbs.indexOf(cymric));
        System.out.println("6: " + numbs.remove(cymric));
        // Must be the exact object:
        System.out.println("7: " + numbs.remove(p));
        System.out.println("8: " + numbs);
        numbs.add(3, rand.nextInt(22)); // Insert at an index
        System.out.println("9: " + numbs);
        List<Integer> sub = numbs.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + numbs.containsAll(sub));
        Collections.sort(sub); // In-place sort
        System.out.println("sorted subList: " + sub);
        // Order is not important in containsAll():
        System.out.println("11: " + numbs.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + numbs.containsAll(sub));
        List<Integer> copy = new ArrayList<>(numbs);
        sub = Arrays.asList(numbs.get(1), numbs.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(numbs); // Get a fresh copy
        copy.remove(2); // Remove by index
        System.out.println("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        System.out.println("15: " + copy);
        copy.set(1, rand.nextInt(22)); // Replace an element
        System.out.println("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        System.out.println("17: " + copy);
        System.out.println("18: " + numbs.isEmpty());
        numbs.clear(); // Remove all elements
        System.out.println("19: " + numbs);
        System.out.println("20: " + numbs.isEmpty());
        numbs.addAll(randomInteger(10, 22));
        System.out.println("21: " + numbs);
        Object[] o = numbs.toArray();
        System.out.println("22: " + o[3]);
        Integer[] pa = numbs.toArray(new Integer[0]);
        System.out.println("23: " + pa[3]);
    }
}