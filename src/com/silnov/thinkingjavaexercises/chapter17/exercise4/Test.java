package com.silnov.thinkingjavaexercises.chapter17.exercise4;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Test {
    static Collection<String> CollectFromText(String fileName) {
        System.out.println(Paths.get(fileName));
        File file = new File(fileName);
        FileReader fr = null;
        Set<String> set = new HashSet<>();
        String s;
        String[] words;

        try {
            fr = new FileReader(file);
            try {
                BufferedReader br = new BufferedReader(fr);
                try {
                    while ((s = br.readLine()) != null) {
                        words = s.split(" ");
                        for (String word : words) {
                            set.add(word);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return set;
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println(CollectFromText(
                "C:\\Users\\silnov\\Documents\\Code\\Java\\ThinkingJavaExercises\\src\\com\\silnov\\thinkingjavaexercises\\chapter17\\exercise4\\Countries.txt"));
    }
}
