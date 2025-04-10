package com.secion_8._06_polymorphism;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner s = new Scanner(System.in);
    while (true) {
      System.out.println("Enter Type (A for Adventure, C for Comedy, S for Science Fiction) or Q to quit:");
      String type = s.nextLine();
      if ("Qq".contains(type)) {
        System.out.println("Goodbye!");
        break;
      }
      System.out.println("Enter Movie Title:");
      final String title = s.nextLine();
      final Movie movie = Movie.getMovie(type, title);
      movie.watchMovie();
    }
  }
}
