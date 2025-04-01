package com.huerta.section_7._01_inheritance;

public class Main {
  public static void main(String[] args) {
    final Employee isra = new Employee("Israel", "03/24/1995", "01/01/2020");
    System.out.println(isra);
    System.out.println("Isra's age: " + isra.getAge());
    System.out.println("Isra's pay: " + isra.collectPay());

    final SalariedEmployee javi = new SalariedEmployee("Javier", "01/01/1990", "01/01/2020", 35000);
    System.out.println(javi);
    System.out.println("Javi's Paycheck = " + javi.collectPay());

    javi.retire();
    System.out.println("Javi's Pension check = " + javi.collectPay());

    final HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
    System.out.println(mary);
    System.out.println("Mary's Paycheck = " + mary.collectPay());
    System.out.println("Mary's Holiday Paycheck = " + mary.getDoublePay());
  }
}
