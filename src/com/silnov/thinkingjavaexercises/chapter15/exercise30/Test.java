package com.silnov.thinkingjavaexercises.chapter15.exercise30;

class Holder<T> {
    private T a;

    public Holder() {
    }

    public Holder(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }
}

public class Test {
    public static void main(String[] args) {
        Holder<Character> charHolder = new Holder<Character>();
        Holder<Byte> byteHolder = new Holder<Byte>();
        Holder<Short> shortHolder = new Holder<Short>();
        Holder<Integer> intHolder = new Holder<Integer>();
        Holder<Long> longHolder = new Holder<Long>();
        Holder<Float> floatHolder = new Holder<Float>();
        Holder<Double> doubleHolder = new Holder<Double>();

        charHolder.set('a');
        System.out.print(charHolder.get() + ", ");
        System.out.println(charHolder.get().getClass());
        char c = charHolder.get();
        System.out.println("char c = charHolder.get() = " + c);
        System.out.println();

        byte b = 1;
        byteHolder.set(b);
        System.out.print(byteHolder.get() + ", ");
        System.out.println(byteHolder.get().getClass());
        byte bb = byteHolder.get();
        System.out.println("byte bb = byteHolder.get() = " + bb);
        System.out.println();

        short s = 1;
        shortHolder.set(s);
        System.out.print(shortHolder.get() + ", ");
        System.out.println(shortHolder.get().getClass());
        short ss = shortHolder.get();
        System.out.println("short ss = shortHolder.get() = " + ss);
        System.out.println();

        intHolder.set(1);
        System.out.print(intHolder.get() + ". ");
        System.out.println(intHolder.get().getClass());
        int i = intHolder.get();
        System.out.println("int i = intHolder.get() = " + i);
        System.out.println();

        long l = 2;
        longHolder.set(l);
        System.out.print(longHolder.get() + ", ");
        System.out.println(longHolder.get().getClass());
        long ll = longHolder.get();
        System.out.println("long ll = longHolder.get() = " + ll);
        System.out.println();

        float f = 1f;
        floatHolder.set(f);
        System.out.print(floatHolder.get() + ", ");
        System.out.println(floatHolder.get().getClass());
        float ff = floatHolder.get();
        System.out.println("float ff = floatHolder.get() = " + ff);
        System.out.println();

        double d = 1.1;
        doubleHolder.set(d);
        System.out.print(doubleHolder.get() + ", ");
        System.out.println(doubleHolder.get().getClass());
        double dd = doubleHolder.get();
        System.out.println("double dd = doubleHolder.get() = " + dd);
    }
}