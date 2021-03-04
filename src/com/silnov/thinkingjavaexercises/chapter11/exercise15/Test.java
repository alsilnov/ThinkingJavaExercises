
package com.silnov.thinkingjavaexercises.chapter11.exercise15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
class Stack<T> {
  private LinkedList<T> storage = new LinkedList<T>();
  public void push(T v) {
    storage.addFirst(v);    
  }
  public T peek() {
    return storage.getFirst();
  }
  public T pop() {
    return storage.removeFirst();
  }
  public boolean isEmpty() {
    return storage.isEmpty();
  }
  @Override
  public String toString() {
    return storage.toString();
  }
}
/**
 * Test
 */
public class Test {
  private static void listAddInteger(LinkedList<Integer> list, Integer[] intArray) {
    for (Integer i : intArray) {
      ListIterator<Integer> it = list.listIterator((list.size())/2);
      it.add(i);
      System.out.println(list);
    }
  }
  public static void main(String[] args) {
    Stack<Character> stack = new Stack<Character>();
    String str = "+U+n+c---+e+r+t---+a+i+n+t+y---+ -+r+u--+l+e+s---";
    char[] charArray = str.toCharArray();
    ArrayList<Character> chList = new ArrayList<Character>();
    for (Character ch : charArray) {
      chList.add(ch);
    }
    ListIterator<Character> it = chList.listIterator(); 
    while(it.hasNext()) {
      switch (it.next()) {
        case '+':
          stack.push(it.next());
          break;
        case '-':
          System.out.print(stack.pop());
          break;
          
        default:
          break;
      }
    }
    System.out.println();
  }
}