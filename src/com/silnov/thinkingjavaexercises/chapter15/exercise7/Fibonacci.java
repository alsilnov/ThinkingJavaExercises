package com.silnov.thinkingjavaexercises.chapter15.exercise7;

import java.util.function.*;
import java.util.stream.*;

public class Fibonacci implements Supplier<Integer> {
  private int count = 0;

  @Override
  public Integer get() {
    return fib(count++);
  }

  private int fib(int n) {
    if (n < 2)
      return 1;
    return fib(n - 2) + fib(n - 1);
  }

}
