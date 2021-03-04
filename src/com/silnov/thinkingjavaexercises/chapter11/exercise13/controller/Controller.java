package com.silnov.thinkingjavaexercises.chapter11.exercise13.controller;

import java.util.*;

public class Controller {
  // A class from java.util to hold Event objects:
  private LinkedList<Event> eventList = new LinkedList<>();
  public void addEvent(Event c) { eventList.add(c); }
  public void run() {
    // Make a copy so you're not modifying the list
    // while you're selecting the elements in it:
    LinkedList<Event> eventListCopy = new LinkedList<>(eventList);
    ListIterator<Event> it = eventListCopy.listIterator();
    while(it.hasNext()) {
      it.next().action();
      it.previous();
      System.out.println(it.next());
    }
    /*
    for(Event e : new ArrayList<>(eventList))
      if(e.ready()) {
        System.out.println(e);
        e.action();
        eventList.remove(e);
      }*/
  }
}