package src.com.silnov.thinkingjavaexercises.chapter18.exercise7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        String fileName = "src\\com\\silnov\\thinkingjavaexercises\\chapter18\\exercise7\\Test.java";
        File f = new File(fileName);
        System.out.println(f.getAbsolutePath());
        LinkedList<String> list = new LinkedList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(f));) {
            StringBuilder sb = new StringBuilder();
            String s;
            while ((s = in.readLine()) != null) {
                list.add(s);
            }
            for (String string : list) {
                System.out.println(string);
            }
            Collections.reverse(list);
            for (String string : list) {
                System.out.println(string);
            }
        } catch (Exception e) {
            System.out.println("IOException");
        }
    }
}