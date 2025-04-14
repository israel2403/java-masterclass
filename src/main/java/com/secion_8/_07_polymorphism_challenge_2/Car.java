package com.secion_8._07_polymorphism_challenge_2;

public class Car {
  private boolean engine = true;
  private int cylinders;
  private String name;
  private int wheels = 4;

  public Car(int cylinders, String name) {
    this.cylinders = cylinders;
    this.name = name;
  }

  public String startEngine() {
    return getClass().getSimpleName() + " -> startEngine()";
  }

  public String accelerate() {
    return getClass().getSimpleName() + " -> accelerate()";
  }

  public String brake() {
    return getClass().getSimpleName() + " -> brake()";
  }

  public String getName() {
    return name;
  }

  public int getCylinders() {
    return cylinders;
  }
}
