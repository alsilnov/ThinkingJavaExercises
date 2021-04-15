// generics/RandomList.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package com.silnov.thinkingjavaexercises.chapter15.exercise18;

import java.util.*;
import java.util.stream.*;

public class RandomList<T> extends ArrayList<T> {
    private Random rand = new Random(47);

    public T select() {
        return get(rand.nextInt(size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        Arrays.stream(("The quick brown fox jumped over " + "the lazy brown dog").split(" ")).forEach(rs::add);
        IntStream.range(0, 11).forEach(i -> System.out.print(rs.select() + " "));

        System.out.println();

        RandomList<Integer> rs1 = new RandomList<>();
        for (int i = 0; i < 100; ++i) {
            rs1.add(i);
        }
        IntStream.range(0, 11).forEach(i -> System.out.print(rs1.select() + " "));
    }
}
/*
 * Output: brown over fox quick quick dog brown The brown lazy brown
 */
