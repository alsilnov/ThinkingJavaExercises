package com.silnov.thinkingjavaexercises.chapter17.exercise9;

import java.util.*;
import TIJ4code.examples.net.mindview.util.*;
public class Test {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		RandomGenerator.String rgs = new RandomGenerator.String(5);
		for (int i = 0; i < 20; i++) {
			ts.add(rgs.next());
		}
		System.out.println(ts);
	}
}