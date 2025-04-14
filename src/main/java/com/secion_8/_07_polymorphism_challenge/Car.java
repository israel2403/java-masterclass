package com.secion_8._07_polymorphism_challenge;

import lombok.Getter;

@Getter
public class Car {
  private String description;

  public Car(final String description) {
    this.description = description;
  }

  public void startEngine() {
    System.out.println("Car -> startEngine");
  }

  protected void runEngine() {
    System.out.println("Car -> runEngine");
  }

  public void drive() {
    System.out.println("Car -> driving, type is " + getClass().getSimpleName());
    runEngine();
  }
}

@Getter
class GasPoweredCar extends Car {

  private double avgKmPerLitre;
  private int cylinders = 6;

  public GasPoweredCar(final String description) {
    super(description);
  }

  public GasPoweredCar(final String description, final double avgKmPerLitre, final int cylinders) {
    super(description);
    this.avgKmPerLitre = avgKmPerLitre;
    this.cylinders = cylinders;
  }

  @Override
  public void startEngine() {
    System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
  }

  @Override
  protected void runEngine() {
    System.out.printf("Gas -> usage exceeds the average of %.2f km/litre%n", avgKmPerLitre);
  }
}

@Getter
class ElectricCar extends Car {

  private double avgKmPerCharge;
  private int batterySize;

  public ElectricCar(final String description, final double avgKmPerCharge, final int batterySize) {
    super(description);
    this.avgKmPerCharge = avgKmPerCharge;
    this.batterySize = batterySize;
  }

  @Override
  public void startEngine() {
    System.out.printf("BEV -> switch  %d kwh battery on, Ready!%n", batterySize);
  }

  @Override
  protected void runEngine() {
    System.out.printf("BEV -> usage under the average of %.2f km/litre%n", avgKmPerCharge);
  }
}

@Getter
class HybridCar extends Car {

  private double avgKmPerLiter;
  private int batterySize;
  private int cylinders;

  public HybridCar(final String description, final double avgKmPerLitre, final int cylinders,
      final int batterySize) {
    super(description);
    this.avgKmPerLiter = avgKmPerLitre;
    this.cylinders = cylinders;
    this.batterySize = batterySize;
  }

  @Override
  public void startEngine() {
    System.out.printf("Hybrid -> All %d cylinders are fired up, Ready!%n", cylinders);
    System.out.printf("Hybrid -> switch  %d kwh battery on, Ready!%n", batterySize);
  }

  @Override
  protected void runEngine() {
    System.out.printf("Hybrid -> usage below average of %.2f km/litre%n", avgKmPerLiter);
  }
}