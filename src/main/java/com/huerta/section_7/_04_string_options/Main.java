package com.huerta.section_7._04_string_options;

public class Main {
  public static void main(String[] args) {
    final String helloWorld = "Hello" + " World";
    helloWorld.concat(" and Goodbye");

    final StringBuilder helloWorldStringBuilder = new StringBuilder("Hello" + " World");
    helloWorldStringBuilder.append(" and Goodbye");

    printInformation(helloWorld);
    printInformation(helloWorldStringBuilder);

    final StringBuilder emptyStart = new StringBuilder();
    final StringBuilder emptyStart32 = new StringBuilder(32);

    printInformation(emptyStart);
    printInformation(emptyStart32);
  }

  public static void printInformation(final String string) {
    System.out.println("String = " + string);
    System.out.println("Length = " + string.length());
  }

  public static void printInformation(final StringBuilder stringBuilder) {
    System.out.println("StringBuilder = " + stringBuilder);
    System.out.println("Length = " + stringBuilder.length());
    System.out.println("Capacity = " + stringBuilder.capacity());
  }
}