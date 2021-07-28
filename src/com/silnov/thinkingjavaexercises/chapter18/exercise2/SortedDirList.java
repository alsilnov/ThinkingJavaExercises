package com.silnov.thinkingjavaexercises.chapter18.exercise2;

import java.io.File;
import java.util.*;
import java.util.regex.*;

public class SortedDirList {
    private File fileSet;
    private String[] dirList;

    SortedDirList(String path) {
        fileSet = new File(path);
        System.out.println("Path: " + path);

        dirList = fileSet.list();
        Arrays.sort(dirList, String.CASE_INSENSITIVE_ORDER);
    }

    public String list(String regex) {
        Pattern pattern = Pattern.compile(regex);
        ArrayList<String> slist = new ArrayList<String>();
        for (String s : dirList) {
            if (pattern.matcher(s).matches()) {
                slist.add(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : slist) {
            sb.append(s + '\n');
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String s : dirList) {
            sb.append(s + '\n');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SortedDirList sdl = new SortedDirList("\\");
        System.out.println("------------------------");
        System.out.print(sdl);
        System.out.println("------------------------");
        System.out.print(sdl.list(".+\\.exe"));
        System.out.println("------------------------");
    }
}
