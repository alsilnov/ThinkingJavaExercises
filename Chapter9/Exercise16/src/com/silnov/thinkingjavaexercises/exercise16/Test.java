package com.silnov.thinkingjavaexercises.exercise16;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;
class RandomCharSeries {
    private Random rand = new Random();
    public char next() {
        return (char)rand.nextInt(128);
    }
    public static void main(String[] Args) {
        RandomCharSeries rn = new RandomCharSeries();
        for (int i = 0; i < 10; ++i) {
            System.out.println(rn.next());
        }
    }
}
class AdaptedRandomCharSeries extends RandomCharSeries implements Readable {
    private long count;
    AdaptedRandomCharSeries(long count) {
        this.count = count;
    }
    public int read(CharBuffer cb){
        if(count-- == 0) {
            return -1;
        }
        cb.append(next());
        return 1;
    }
}
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new AdaptedRandomCharSeries(10));
        while(sc.hasNext()) {
            System.out.println(sc.next());
        }
    }
}
