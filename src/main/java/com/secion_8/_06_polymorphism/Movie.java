package com.secion_8._06_polymorphism;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Movie {
  private String title;

  public void watchMovie() {
    String instanceType = this.getClass().getSimpleName();
    System.out.println(title + " is a " + instanceType + " film.");
  }

  public static Movie getMovie(final String type, final String title) {
    return switch (type.toUpperCase().charAt(0)) {
      case 'A' -> new AdventureMovie(title);
      case 'C' -> new ComedyMovie(title);
      case 'S' -> new ScienceFiction(title);
      default -> new Movie(title);
    };
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

  public void watchAdventure() {
    System.out.println("Watching Adventure Movie");
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

  public void watchComedy() {
    System.out.println("Watching Comedy Movie");
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

  public void watchScienceFiction() {
    System.out.println("Watching Science Fiction Movie");
  }
}