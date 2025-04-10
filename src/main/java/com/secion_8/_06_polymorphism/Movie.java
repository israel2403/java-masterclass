package com.secion_8._06_polymorphism;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Movie {
  private String title;

  public void watchMovie() {
    String instanceType = this.getClass().getSimpleName();
    System.out.println(title + " is a " + instanceType + " film.");
  }
}
