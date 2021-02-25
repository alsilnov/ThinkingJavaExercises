package com.silnov.thinkingjavaexercises.chapter13.exercise11;

import java.io.PrintStream;
import java.util.regex.*;
//Regular expression: (?i)((^[aeiou])|(\s+[aeiou]))\\w+?[aeiou]\b
//Input: "Arline ate eight apples and one orange while Anita hadn't any" 
public class TestRegularExpression {
	public static void main(String[] args) {
		String regEXP = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
		String in = "Arline ate eight apples and one orange while Anita hadn't any";
		System.out.println("Regular expression: \"" + regEXP + "\"");
		Pattern p = Pattern.compile(regEXP);
		Matcher m = p.matcher(in);
		while(m.find()) {
			System.out.println("Match \"" + m.group() + "\" at position " +
				m.start() + ((m.end() - m.start() < 2) ? "" :  ("-" + (m.end() - 1))));
		}
	}
}