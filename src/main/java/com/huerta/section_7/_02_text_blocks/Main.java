package com.huerta.section_7._02_text_blocks;

public class Main {
  public static void main(String[] args) {
    String bulletIt = "Print a Bulleted List: \n" +
        "\t\u2022 First Point\n" +
        "\t\t\u2022 Sub Point";
    System.out.println(bulletIt);

    final String textBlock = """
        Print a Bulleted List:
          \u2022 First Point
            \u2022 Sub Point""";
    System.out.println(textBlock);

    final int age = 30;
    System.out.printf("Your age is %d%n", age);

    final int yearOfBirth = 2025 - age;
    System.out.printf("Age = %d, Your year of birth is %d%n", age, yearOfBirth);

    System.out.printf("Your age is %.2f%n", (float) age);

    for (int i = 1; i <= 100000; i *= 10) {
      System.out.printf("Printing %6d%n", i);
    }

    String formattedSTring = String.format("Your age is %d", age);
    System.out.println(formattedSTring);

    formattedSTring = "Your age is %d".formatted(age);
    System.out.println(formattedSTring);
  }
}
