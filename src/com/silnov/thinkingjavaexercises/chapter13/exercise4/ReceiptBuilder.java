package com.silnov.thinkingjavaexercises.chapter13.exercise4;
// strings/ReceiptBuilder.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
import java.util.*;

public class ReceiptBuilder {
  private double total = 0;
  private final String formatTitle = "%-15s %5s %10s%n";
  private final String formatNewItem = "%-15.15s %5d %10.2f%n";
  private final String formatTaxAndTotal = "%-15s %5s %10.2f%n";
  private Formatter f =
    new Formatter(new StringBuilder());
  public ReceiptBuilder() {
    f.format(
      formatTitle, "Item", "Qty", "Price");
    f.format(
      formatTitle, "----", "---", "-----");
  }
  public void add(String name, int qty, double price) {
    f.format(formatNewItem, name, qty, price);
    total += price * qty;
  }
  public String build() {
    f.format(formatTaxAndTotal, "Tax", "",
      total * 0.06);
    f.format(formatTitle, "", "", "-----");
    f.format(formatTaxAndTotal, "Total", "",
      total * 1.06);
    return f.toString();
  }
  public static void main(String[] args) {
    ReceiptBuilder receiptBuilder =
      new ReceiptBuilder();
    receiptBuilder.add("Jack's Magic Beans", 4, 4.25);
    receiptBuilder.add("Princess Peas", 3, 5.1);
    receiptBuilder.add(
      "Three Bears Porridge", 1, 14.29);
    System.out.println(receiptBuilder.build());
  }
}
/* Output:
Item              Qty      Price
----              ---      -----
Jack's Magic Be     4       4.25
Princess Peas       3       5.10
Three Bears Por     1      14.29
Tax                         2.80
                           -----
Total                      49.39
*/