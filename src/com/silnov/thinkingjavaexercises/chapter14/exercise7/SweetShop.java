package com.silnov.thinkingjavaexercises.chapter14.exercise7;
// typeinfo/Shapes.java

// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Examination of the way the class loader works

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: sweetName");
            System.exit(0);
        }
        try {
            Class.forName("com.silnov.thinkingjavaexercises.chapter14.exercise7." + args[0]);
            System.out.println(("Enjoy your " + args[0]));
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find " + args[0]);
        }
    }
}