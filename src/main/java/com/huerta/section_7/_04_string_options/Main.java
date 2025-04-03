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
    emptyStart.append("a".repeat(57));

    final StringBuilder emptyStart32 = new StringBuilder(32);
    emptyStart32.append("a".repeat(17));

    printInformation(emptyStart);
    printInformation(emptyStart32);

    final StringBuilder builderPlus = new StringBuilder("Hello" + " World");
    builderPlus.append(" and Goodbye");

    builderPlus.deleteCharAt(16).insert(16, "g");
    System.out.println(builderPlus);

    builderPlus.replace(16, 17, "G");
    System.out.println(builderPlus);

    builderPlus.reverse().setLength(7);
    System.out.println(builderPlus);
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