package com.huerta.section_7._03_all_about_strings;

public class StringMethods {
  public static void main(String[] args) {

    final String birthday = "25/11/1982";
    final int startingIndex = birthday.indexOf("1982");
    System.out.printf("Starting index of 1982 in %s is %d%n", birthday, startingIndex);
    System.out.printf("Birth year in %s is %s%n", birthday, birthday.substring(startingIndex));

    System.out.printf("Month in %s is %s%n", birthday, birthday.substring(3, 5));

    String newDate = String.join("/", "25", "11", "1982");
    System.out.printf("New date is %s%n", newDate);

    newDate = "25";
    newDate = newDate.concat("/");
    newDate = newDate.concat("11");
    newDate = newDate.concat("/");
    newDate = newDate.concat("1982");
    System.out.printf("New date is %s%n", newDate);

    newDate = "25" + "/" + "11" + "/" + "1982";
    System.out.printf("New date is %s%n", newDate);

    newDate = "25".concat("/").concat("11").concat("/").concat("1982");
    System.out.printf("New date is %s%n", newDate);

    // replace caratacter with replace method
    System.out.printf("New date is %s%n", newDate.replace("/", "-"));

    // replace frst character with replaceFirst method
    System.out.printf("New date is %s%n", newDate.replaceFirst("/", "-"));

    // replace all characters with replaceAll method
    System.out.printf("New date is %s%n", newDate.replaceAll("/", "---"));

    // use repeat method
    System.out.println("ABC\n".repeat(3));
    System.out.println("-".repeat(20));

    // use indent method
    System.out.println("ABC\n".repeat(3).indent(8));
    System.out.println("-".repeat(20));

    System.out.println("    ABC\n".repeat(3).indent(-2));
    System.out.println("-".repeat(20));
  }
}
