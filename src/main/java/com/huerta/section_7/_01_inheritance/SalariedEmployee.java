package com.huerta.section_7._01_inheritance;

public class SalariedEmployee extends Employee {
  double annualSalary;
  boolean isRetired;

  public SalariedEmployee(final String name, final String birthDate,
      final String hireDate, final double annualSalary) {
    super(name, birthDate, hireDate);
    this.annualSalary = annualSalary;
  }

  @Override
  public double collectPay() {
    final double paycheck = (annualSalary / 26);
    final double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
    return (int) (adjustedPay);
  }

  public void retire() {
    terminate("12/12/2025");
    isRetired = true;
  }
}
