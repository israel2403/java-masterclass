package com.secion_8._02_smart_kitchen;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Refrigerator {
  private boolean hasWorkToDo;

  public void orderFood() {
    if (hasWorkToDo) {
      System.out.println("Ordering food...");
      this.hasWorkToDo = false;
    }
  }
}
