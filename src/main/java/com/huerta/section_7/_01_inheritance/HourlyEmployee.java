package com.huerta.section_7._01_inheritance;

public class HourlyEmployee extends Employee {
  private double hourlyPayRate;

  public HourlyEmployee(final String name, final String birthDate,
      final String hireDate, final double hourlyPayRate) {
    super(name, birthDate, hireDate);
    this.hourlyPayRate = hourlyPayRate;
  }

  @Override
  public double collectPay() {
    return 40 * hourlyPayRate;
  }

  public double getDoublePay() {
    return 2 * collectPay();
  }
}
