package com.silnov.thinkingjavaexercises.chapter16.exercise23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Test {
	static class IntegerComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return (o1 < o2 ? -1 : (o1 == o2 ? 0 : 1));
		}

	}

	private static Random r = new Random();

	public static void main(String[] args) {
		Integer[] ia = new Integer[20];
		for (int i = 0; i < ia.length; i++) {
			ia[i] = r.nextInt(20);
		}
		System.out.println("not sorted");
		System.out.println(Arrays.toString(ia));
		System.out.println("sorted");
		Arrays.sort(ia, new IntegerComparator());
		System.out.println(Arrays.toString(ia));
	}
}