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

class AdventureMovie extends Movie {
  public AdventureMovie(String title) {
    super(title);
  }

  @Override
  public void watchMovie() {
    super.watchMovie();
    System.out.printf(".. %s%n".repeat(3), "Pleasant Scene", "Scary Music", "Something Bad Happens");
  }
}