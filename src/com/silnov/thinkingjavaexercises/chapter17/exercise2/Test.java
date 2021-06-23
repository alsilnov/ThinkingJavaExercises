package com.silnov.thinkingjavaexercises.chapter17.exercise2;

import java.util.*;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        
        Pattern p = Pattern.compile("A.*");
        for (int i = 0; i < Countries.DATA.length; i++) {
            if (p.matcher(Countries.DATA[i][0]).matches())
                m.put(Countries.DATA[i][0], Countries.DATA[i][1]);
        }
        Set<String> s = m.keySet();
        System.out.println(m);
        System.out.println(s);
    }
}
