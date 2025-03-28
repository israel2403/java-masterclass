package com.huerta.section_7._01_inheritance;

import lombok.ToString;

@ToString
public class Employee extends Worker {

  private long employeeId;

  private String hireDate;

  private static int employeeNo = 1;

  public Employee(final String name, final String birthDate,
      final String hireDate) {
    super(name, birthDate);
    this.employeeId = Employee.employeeNo++;
    this.hireDate = hireDate;
  }
}
