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
  }
}
