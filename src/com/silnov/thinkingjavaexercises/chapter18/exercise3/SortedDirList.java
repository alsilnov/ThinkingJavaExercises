package com.silnov.thinkingjavaexercises.chapter18.exercise3;

import java.io.File;
import java.util.*;
import java.util.regex.*;

public class SortedDirList {
    private File path;
    private File[] files;

    SortedDirList(String path) {
        this.path = new File(path);
        System.out.println("Path: " + this.path.getAbsolutePath());
        files = this.path.listFiles();
    }

    long totalSize() {
        long sum = 0;
        for (File f : files) {
            System.out.print(f + ": ");
            System.out.println(f.length());
            sum += f.length();
        }
        return sum;
    }

    public static void main(String[] args) {
        SortedDirList sdl = new SortedDirList("\\");
        System.out.println("------------------------");
        long totalSize = sdl.totalSize();
        System.out.println("------------------------");
        System.out.println("Total size: " + totalSize);
        System.out.println("------------------------");
    }
}
