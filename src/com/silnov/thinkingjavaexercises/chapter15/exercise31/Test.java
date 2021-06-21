package com.silnov.thinkingjavaexercises.chapter15.exercise31;

import javax.management.PersistentMBean;

import com.silnov.thinkingjavaexercises.chapter10.exercise14.HorrorShow;

interface Payable {
}

class Employee implements Payable {
}

class Hourly extends Employee {
}

public class Test {
    public static void main(String[] args) {
        new Hourly();
    }
}