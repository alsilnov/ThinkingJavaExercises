package com.silnov.thinkingjavaexercises.chapter18.exercise1;

import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList {
  public static void main(String[] args) {
    File path = new File("\\");
    System.out.println(path);
    String[] list;
    if (args.length < 2) {
      list = path.list();
    } else {
      list = path.list(new DirFilter(args));
    }
    Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
    for (String dirItem : list)
      System.out.println(dirItem);
  }
}

class DirFilter implements FilenameFilter {
  private Pattern pattern;
  String[] args;

  public DirFilter(String[] args) {
    this.args = args;
    pattern = Pattern.compile(args[0]);
  }

  public boolean accept(File dir, String name) {
    return pattern.matcher(name).matches()
        && !(Collections.disjoint(Arrays.asList(args).subList(1, args.length), new TextFile(name, "\\W+")));
  }
}