package src.com.silnov.thinkingjavaexercises.chapter18.exercise13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------");
        String fileName;
        if (args.length == 1) {
            fileName = args[0];
        } else {
            fileName = "src\\com\\silnov\\thinkingjavaexercises\\chapter18\\exercise12\\Test.java";
        }
        File f = new File(fileName);
        System.out.println(f.getAbsolutePath());
        System.out.println("------------------------------------------------------------------");
        LinkedList<String> list = new LinkedList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(f));) {
            String s;
            LineNumberReader lineNumber = new LineNumberReader(in);
            while ((s = lineNumber.readLine()) != null) {
                list.add(lineNumber.getLineNumber() + ":    " + s);
            }
            PrintWriter out = new PrintWriter(
                    "src\\com\\silnov\\thinkingjavaexercises\\chapter18\\exercise13\\Test.txt");

            for (String string : list) {
                System.out.println(string);
                out.println(string);
            }
            out.close();
            System.out.println("------------------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("IOException");
        }
    }
}