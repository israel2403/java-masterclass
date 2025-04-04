package com.secion_8._02_smart_kitchen;

import lombok.Getter;

@Getter
public class SmartKitchen {
  private CoffeeMaker brewMaster;
  private Refrigerator iceBox;
  private DishWasher dishWasher;

  public SmartKitchen() {
    this.iceBox = new Refrigerator();
    this.brewMaster = new CoffeeMaker();
    this.dishWasher = new DishWasher();
  }

  private void addWater() {
  }

  private void pourMilk() {
  }

  private void loadDishWasher() {
  }

  public void setKitchenState(boolean coffeFlag, boolean frigeratorFlag, boolean dishWasherFlag) {
    this.brewMaster.setHasWorkToDo(coffeFlag);
    this.iceBox.setHasWorkToDo(frigeratorFlag);
    this.dishWasher.setHasWorkToDo(dishWasherFlag);
  }

  void doKitchenWork() {
    this.brewMaster.brewCoffee();
    this.iceBox.orderFood();
    this.dishWasher.doDishes();
  }
}
