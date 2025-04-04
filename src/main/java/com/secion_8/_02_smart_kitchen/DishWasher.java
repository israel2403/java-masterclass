package com.secion_8._02_smart_kitchen;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public class DishWasher {
  private boolean hasWorkToDo;

  public void doDishes() {
    if (hasWorkToDo) {
      System.out.println("Washing dishes...");
      this.hasWorkToDo = false;
    }
  }
}
