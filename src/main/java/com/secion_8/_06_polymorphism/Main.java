package com.secion_8._06_polymorphism;

public class Main {
  public static void main(String[] args) {
    final Movie movie = Movie.getMovie("Adventure", "The Hobbit");
    movie.watchMovie();
  }
}
