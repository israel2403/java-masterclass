package com.huerta.section_7._04_string_options;

public class Main {
  public static void main(String[] args) {

  }

  public static void printInformation(final String string) {
    System.out.println("String = " + string);
    System.out.println("Length = " + string.length());
  }

  public static void printInformation(final StringBuilder stringBuilder) {
    System.out.println("StringBuilder = " + stringBuilder);
    System.out.println("Length = " + stringBuilder.length());
  }
}