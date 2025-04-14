package com.secion_8._07_polymorphism_challenge;

public class Main {
  public static void main(String[] args) {
    final Car car = new Car("2022 Blue Ferrari 299 GTS");
    runRace(car);
    Car ferrari = new GasPoweredCar("2022 Blue Ferrari 299 GTS", 15.4, 6);
    runRace(ferrari);
  }

  public static void runRace(final Car car) {
    car.startEngine();
    car.drive();

  }
}
