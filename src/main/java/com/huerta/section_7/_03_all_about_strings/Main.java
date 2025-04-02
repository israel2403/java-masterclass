package com.huerta.section_7._03_all_about_strings;

public class Main {
  public static void main(String[] args) {
    printInformation("Hello World");
    printInformation("");
    printInformation("\t   \n");

    String helloWorld = "Hello World";
    System.out.printf("index of 'r' in %s is %d%n", helloWorld, helloWorld.indexOf('r'));

    System.out.printf("index of 'World' in %s is %d%n", helloWorld, helloWorld.indexOf("World"));
    System.out.printf("index of 'l' in %s is %d%n", helloWorld, helloWorld.lastIndexOf("l"));

    System.out.printf("index of 'World' in %s is %d%n", helloWorld, helloWorld.indexOf("l", 3));
    System.out.printf("index of 'l' in %s is %d%n", helloWorld, helloWorld.lastIndexOf("l", 8));

    final String helloworldLowerCase = helloWorld.toLowerCase();
    if (helloWorld.equals(helloworldLowerCase)) {
      System.out.printf("%s is equal to %s%n", helloWorld, helloworldLowerCase);
    }
    if (helloWorld.equalsIgnoreCase(helloworldLowerCase)) {
      System.out.printf("%s values match ignoring case %s%n", helloWorld, helloworldLowerCase);
    }
  }

  public static void printInformation(final String string) {
    final int length = string.length();
    System.out.printf("Length of %s is %d%n", string, length);
    if (string.isEmpty()) {
      System.out.println("String is empty");
      return;
    }
    if (string.isBlank()) {
      System.out.println("String is blank");

    }
    System.out.printf("First character of %s is %c%n", string, string.charAt(0));

    System.out.printf("Last character of %s is %c%n", string, string.charAt(length - 1));
  }
}
