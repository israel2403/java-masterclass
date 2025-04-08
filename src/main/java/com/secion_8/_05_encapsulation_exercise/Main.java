package com.secion_8._05_encapsulation_exercise;

public class Main {
  public static void main(String[] args) {
    Printer printer = new Printer(50, true);
    System.out.println("Initial toner level: " + printer.getPagesPrinted());

    final int pagesPrinted = printer.printPages(5);
    System.out.printf("Current Job Pages: %d, Printer Total Pages: %d%n", pagesPrinted, printer.getPagesPrinted());
  }
}
