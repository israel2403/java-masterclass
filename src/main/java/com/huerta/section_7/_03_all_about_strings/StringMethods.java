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
  }
}
