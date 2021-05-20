package com.silnov.thinkingjavaexercises.chapter16.exercise22;

import java.util.Arrays;
import java.util.Random;

public class Test {
	private static Random r = new Random();

	public static void main(String[] args) {
		int[] ia = new int[20];
		for (int i = 0; i < ia.length; i++) {
			ia[i] = r.nextInt(20);
		}
		System.out.println(Arrays.toString(ia));
		for (int i = 0; i < 10; i++) {
			int index = Arrays.binarySearch(ia, i);
			if (index < 0)
				System.out.println(i + " not found");
			else
				System.out.println("Index: " + index + ", " + i);
		}
		System.out.println("sort");
		Arrays.sort(ia);
		System.out.println(Arrays.toString(ia));
		for (int i = 0; i < 10; i++) {
			int index = Arrays.binarySearch(ia, i);
			if (index < 0)
				System.out.println(i + " not found");
			else
				System.out.println("Index: " + index + ", " + i);
		}
	}
}