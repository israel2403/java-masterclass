package com.huerta.section_7._01_inheritance;

public class Main {
  public static void main(String[] args) {
    final Employee isra = new Employee("Israel", "03/24/1995", "01/01/2020");
    System.out.println(isra);
    System.out.println("Isra's age: " + isra.getAge());
    System.out.println("Isra's pay: " + isra.collectPay());

    final Employee javi = new Employee("Javier", "01/01/1990", "01/01/2020");
    System.out.println(javi);
  }
}
