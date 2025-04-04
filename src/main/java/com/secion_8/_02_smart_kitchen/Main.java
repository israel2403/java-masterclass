package com.secion_8._02_smart_kitchen;

public class Main {
  public static void main(String[] args) {

    SmartKitchen smartKitchen = new SmartKitchen();
    smartKitchen.setKitchenState(true, false, true);
    smartKitchen.doKitchenWork();
  }
}
