package com.silnov.thinkingjavaexercises.chapter16.exercise25;

import java.util.*;

class MyList extends ArrayList<Integer> {
    List<Integer> list;

    MyList(List<Integer> list) {
        this.list = list;
    }

    MyList getReversed() {
        List copyList = new ArrayList<Integer>();
        ListIterator lit = list.listIterator(list.size());
        while (lit.hasPrevious()) {
            copyList.add(lit.previous());
        }
        return new MyList(copyList);
    }
}

public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list.getClass().getSimpleName());
        System.out.println(list);
        System.out.println(list.get(4));
        list.add(6);
        list.addAll(Arrays.asList(7, 8));
        System.out.println(list);
        List<Integer> listSlice = list.subList(2, 4);
        System.out.println(listSlice);

        MyList list2 = new MyList(list);
        System.out.println(list2.getClass().getSimpleName());
        System.out.println(list2.getReversed().list);
    }
}