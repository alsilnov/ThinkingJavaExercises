package com.silnov.thinkingjavaexercises.chapter12.exercise24;
import java.io.*;

public class Test {
	private static String fileInExercisePath = "Exercise24/src/com/silnov/thinkingjavaexercises/exercise24/";
	private static String exercisePath = System.getProperty("user.dir") + "/";
	private BufferedReader in;
	public Test(String fname) throws Exception {
		try {
			in = new BufferedReader(new FileReader(fname));
		} catch(FileNotFoundException e) {
			System.out.println("Could not find file " + fname);
			throw e;
		} catch(Exception e) {
			try {
				in.close();
			} catch(IOException e2) {
				System.out.println("in.close() failed");
			}
			throw e;
		}
	}
	public String getLine() {
		String s;
		try {
			s = in.readLine();
		} catch(IOException e) {
			throw new RuntimeException("readLine() failed");
		}
		return s;
	}
	public void dispose() {
		try {
			in.close();
			System.out.println("dispose() successful");
		} catch(IOException e2) {
			throw new RuntimeException("in.close() failed");
		}
	}	
	public static void main(String[] args) {
		try {
			Test fc = 
				new Test(exercisePath + fileInExercisePath + "Test.java");
			try {
				String s;
				int i = 1;
				while((s = fc.getLine()) != null) {
					System.out.println(i + " " + s);
					i++;
				}
			} catch(Exception e) {
				System.out.println("Exception caught in main()");
				e.printStackTrace(System.err);
			} finally {
				fc.dispose();
			}
		} catch(Exception e) {
			System.out.println("Test construction failed");
		}
	}
}