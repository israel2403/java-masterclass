package com.secion_8._01_computer_factory;

public class Product {

  private String model;
  private String manufacturer;
  private int width;
  private int height;
  private int depth;

  public Product(final String model, final String manufacturer) {
    this.model = model;
    this.manufacturer = manufacturer;
  }
}

class Monitor extends Product {

  private int size;
  private String resolution;

  public Monitor(final String model, final String manufacturer) {
    super(model, manufacturer);
  }

  public Monitor(final String model, final String manufacturer, final int size,
      final String resolution) {
    super(model, manufacturer);
    this.size = size;
    this.resolution = resolution;
  }

  public void drawPixel(final int x, final int y, final String color) {
    System.out.println(String.format("Drawing Pixel at (%d, %d) in color %s", x, y, color));
  }
}

class Motherboard extends Product {

  private int ramSlots;
  private int cardSlots;
  private String bios;

  public Motherboard(final String model, final String manufacturer) {
    super(model, manufacturer);
  }

  public Motherboard(final String model, final String manufacturer, final int ramSlots,
      final int cardSlots, final String bios) {
    super(model, manufacturer);
    this.ramSlots = ramSlots;
    this.cardSlots = cardSlots;
    this.bios = bios;
  }

  public void loadProgram(final String programName) {
    System.out.println("Program " + programName + " is loading...");
  }
}

class ComputerCase extends Product {

  private String powerSupply;

  public ComputerCase(final String model, final String manufacturer) {
    super(model, manufacturer);
  }

  public ComputerCase(final String model, final String manufacturer, final String powerSupply) {
    super(model, manufacturer);
    this.powerSupply = powerSupply;
  }

  public void pressPowerButton() {
    System.out.println("Power button pressed");
  }
}