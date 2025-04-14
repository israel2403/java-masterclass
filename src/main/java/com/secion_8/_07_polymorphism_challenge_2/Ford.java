package com.secion_8._07_polymorphism_challenge_2;

public class Ford extends Car {

  public Ford(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public String startEngine() {
    return getClass().getSimpleName() + " -> startEngine()";
  }

  @Override
  public String accelerate() {
    return getClass().getSimpleName() + " -> accelerate()";
  }

  @Override
  public String brake() {
    return getClass().getSimpleName() + " -> brake()";
  }
}
