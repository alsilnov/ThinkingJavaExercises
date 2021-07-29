package src.com.silnov.thinkingjavaexercises.chapter18.exercise8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------");
        String fileName;
        if (args.length == 1) {
            fileName = args[0];
        } else {
            fileName = "src\\com\\silnov\\thinkingjavaexercises\\chapter18\\exercise8\\Test.java";
        }
        File f = new File(fileName);
        System.out.println(f.getAbsolutePath());
        System.out.println("------------------------------------------------------------------");
        LinkedList<String> list = new LinkedList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(f));) {
            String s;
            while ((s = in.readLine()) != null) {
                list.add(s);
            }
            for (String string : list) {
                System.out.println(string);
            }
            System.out.println("------------------------------------------------------------------");
            Collections.reverse(list);
            for (String string : list) {
                System.out.println(string);
            }
            System.out.println("------------------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("IOException");
        }
    }
}