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

class ComedyMovie extends Movie {
  public ComedyMovie(String title) {
    super(title);
  }

  @Override
  public void watchMovie() {
    super.watchMovie();
    System.out.printf(".. %s%n".repeat(3), "Some Funny Happens", "Happy Ending", "Happy Ending");
  }
}

class ScienceFiction extends Movie {
  public ScienceFiction(String title) {
    super(title);
  }

  @Override
  public void watchMovie() {
    super.watchMovie();
    System.out.printf(".. %s%n".repeat(3), "Bad Aliens do Bad Stuff", "Space Guys Chase Aliens", "Planet Blows Up");
  }
}