package com.secion_8._02_smart_kitchen;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public class CoffeeMaker {
  private boolean hasWorkToDo;

  public void brewCoffee() {
    if (hasWorkToDo) {
      System.out.println("Making coffee...");
      this.hasWorkToDo = false;
    }
  }
}
