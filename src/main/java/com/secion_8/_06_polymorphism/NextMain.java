
package com.secion_8._06_polymorphism;

public class NextMain {

  public static void main(String[] args) {
    final Movie movie = Movie.getMovie("A", "Jaws");
    movie.watchMovie();

    AdventureMovie jaws = (AdventureMovie) Movie.getMovie("A", "Jaws");
    jaws.watchMovie();

    final Object comedy = Movie.getMovie("C", "Airplane");
    ComedyMovie comedyMovie = (ComedyMovie) comedy;
    comedyMovie.watchMovie();

    var airplane = Movie.getMovie("C", "Airplane");
    airplane.watchMovie();

    var plane = new ComedyMovie("Airplane");
    plane.watchComedy();

    Object unknownObject = Movie.getMovie("S", "Star Wars");
    if (unknownObject.getClass().getSimpleName().equals("ComedyMovie")) {
      final ComedyMovie comedyMovie1 = (ComedyMovie) unknownObject;
      comedyMovie1.watchComedy();
    } else if (unknownObject instanceof AdventureMovie) {
      ((AdventureMovie) unknownObject).watchAdventure();
    } else if (unknownObject instanceof ScienceFiction syfy) {
      syfy.watchMovie();
    } else {
      System.out.println("Unknown Movie Type");

    }
  }
}