package com.silnov.thinkingjavaexercises.chapter16.exercise8;

public class Test<T> {
    @SuppressWarnings("unchecked")
	T[] a = (T[])new Object[2]; // Compile warning: unchecked cast
	public static void main(String[] args) {
		String[] sa = new String[2];
		// sa[0] = new Integer(0); // error: incompatible types
		Object[] oa = new Object[3];
		oa[0] = new String("hi");
		int x = 2;
		oa[2] = x; // Autoboxing converts int to Integer:
		System.out.println("oa[2]: " + oa[2].getClass());
		oa = sa;
		System.out.println("oa: " + oa.getClass());
		// compiles, but Runtime ArrayStoreException:
		// oa[0] = 3;
	}	
}
