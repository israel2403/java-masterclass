package com.huerta.section_7._01_inheritance;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class Worker {

  private String name;
  private String birthDate;
  protected String endDate;

  public Worker(final String name, final String birthDate) {
    this.name = name;
    this.birthDate = birthDate;
  }

  public int getAge() {
    final int currentYear = 2025;
    final int birthYear = Integer.parseInt(birthDate.split("/")[2]);
    return currentYear - birthYear;
  }

  public double collectPay() {
    return 0.0;
  }

  public void terminate(final String endDate) {
    this.endDate = endDate;
  }
}