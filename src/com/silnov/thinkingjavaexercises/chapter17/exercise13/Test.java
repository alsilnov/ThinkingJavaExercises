package com.silnov.thinkingjavaexercises.chapter17.exercise13;

import TIJ4code.examples.containers.*;
import TIJ4code.examples.net.mindview.util.*;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		// File whose words are to be counted:
		String fileName = "/home/alex/Code/ThinkingJavaExercises/src/com/silnov/thinkingjavaexercises/chapter17/exercise13/The Canterville Ghost.txt";
		// Set of unique words in file:
		Set<String> words = new TreeSet<String>(new TextFile(fileName, "\\W+"));
		// Create initialize array of correct length:
		AssociativeArray<String, Integer> wordCount = new AssociativeArray<String, Integer>(words.size());
		// Word list of all words in file:
		ArrayList<String> fileList = new TextFile(fileName, "\\W+");
		// Count appearances of each unique word and add to array:
		for (String s : words) {
			int count = 0;
			for (String t : fileList) {
				if (t.equals(s)) {
					count++;
				}
			}
			wordCount.put(s, count);
		}
		System.out.println(wordCount);
	}
}