package com.secion_8._03_bedroom_composition;

public class Lamp {
  // write code here
  private String style;
  private boolean battery;
  private int globRating;

  Lamp(String style, boolean battery, int globRating) {
    this.style = style;
    this.battery = battery;
    this.globRating = globRating;
  }

  public void turnOn() {
    System.out.print("Lamp -> Turning on");
  }

  public String getStyle() {
    return this.style;
  }

  public boolean isBattery() {
    return this.battery;
  }

  public int getGlobRating() {
    return this.globRating;
  }
}